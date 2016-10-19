package controller.managers;


import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;

import controller.tools.JsonTools;
import model.api.Manager;
import model.api.ManagerDecorator;
import model.api.ManagerListener;
import network.api.Messages;
import network.api.Peer;
import network.api.SearchListener;
import network.api.ServiceListener;
import network.api.service.Service;
import network.factories.AdvertisementFactory;
import network.impl.resilient.Resilient;
import network.api.advertisement.ResilientAdvertisementInterface;
import network.impl.resilient.ResilientRequestService;

public class ResilienceItemManagerDecorator extends ManagerDecorator<Resilient>{

	private Peer peer;
	private String who;

	/**
	 *
	 * @param em Item async manager
	 * @param peer Peer instance, started
	 * @param who who own this instance
	 */
	public ResilienceItemManagerDecorator(Manager<Resilient> em, Peer peer, String who) {
		super(em);
		this.peer = peer;
		this.who = who;
	}


	@Override
	public void findAllByAttribute(String attribute, final String value, final ManagerListener<Resilient> l) {
		super.findAllByAttribute(attribute, value, l);
		final ResilientRequestService resilientSender = (ResilientRequestService) peer.getService(ResilientRequestService.NAME);
		Service resilient = peer.getService(ResilientService.NAME);

		resilientSender.removeListener(who);
		resilientSender.addListener(new ServiceListener() {

			@Override
			public void notify(Messages messages) {
				JsonTools<ArrayList<Resilient> json = new JsonTools<>(new TypeReference<ArrayList<Resilient>(){});
				ArrayList<Resilient> resilient= json.toEntity(messages.getMessage("ResilientSxp"));
				System.out.println("Discussion crée !");
				System.out.println(messages.getMessage("ResilientSxp"));
				for(Peer i : peers) {
					System.out.println(i.getUri());
				}
				l.notify(json.toEntity(messages.getMessage("ResilientSxp")));
			}

		}, who == null ? "test":who);

		items.search(attribute, value, new SearchListener<ItemAdvertisementInterface>() {
			@Override
			public void notify(Collection<ResilientAdvertisementInterface> result) {
				ArrayList<String> uids = new ArrayList<>();
				for(ResilientAdvertisementInterface i: result) {
					uids.add(i.getSourceURI());
				}
				resilientSender.sendRequest(value, who == null ? "test":who, uids.toArray(new String[1]));
			}

		});
	}



	@Override
	public void persist(Resilient entity) {
		super.persist(entity);
	/*	ResilientAdvertisementInterface iadv = AdvertisementFactory.createResilientAdvertisement();
		iadv.setTitle(entity.getTitle());
		iadv.publish(peer);*/
	}

	@Override
	public void begin(Resilient entity) {
		super.begin();
		ResilientAdvertisementInterface iadv = AdvertisementFactory.createResilientAdvertisement();
		iadv.setTitle(entity.getTitle());
		iadv.publish(peer);
	}

	@Override
	public void end() {
		super.end();
	}

}
