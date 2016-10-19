package network.factories;

import network.api.ItemRequestService;
import network.impl.jxta.JxtaItemsSenderService;
import network.impl.resilient.ResilientRequestService;
import network.impl.resilient.JxtaResilientSenderService;

public class ServiceFactory {
	public ItemRequestService createItemRequestService() {
		return new JxtaItemsSenderService();
	}
	
	public ResilientRequestService createResilientSxpService()
	{
		return new JxtaResilientSenderService();
	}
}
