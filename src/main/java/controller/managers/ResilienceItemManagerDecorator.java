
package controller.managers;

import model.entity.Item;
import network.api.Peer;

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
import network.api.advertisement.ResilientAdvertisementInterface;
import network.factories.AdvertisementFactory;
import network.impl.resilient.ResilientService;
import network.impl.resilient.Resilient;
import network.impl.resilient.ResilientRequestService;

public class ResilienceItemManagerDecorator extends ManagerDecorator<Item>{

	private Peer peer;	

	/**
	 *
	 * @param em Item async manager
	 * @param peer Peer instance, started
	 * @param who who own this instance
	 */
	public ResilienceItemManagerDecorator(Manager<Item> em, Peer peer) {
		super(em);
		this.peer = peer;
	}


	public void persist(Item entity) {
		super.persist(entity);
		ResilientAdvertisementInterface iadv = AdvertisementFactory.createResilientAdvertisement();
		iadv.publish(peer);
	}

	
	public void begin(Resilient entity) {
		super.begin();
		ResilientAdvertisementInterface iadv = AdvertisementFactory.createResilientAdvertisement();
		iadv.setKey(entity.getId());
		iadv.publish(peer);
	}

	@Override
	public void end() {
		super.end();
	}

}
