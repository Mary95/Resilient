package network.factories;

import network.api.ItemRequestService;
import network.impl.jxta.JxtaItemsSenderService;
import resilient.api.ResilientRequestService;
import resilient.impl.JxtaResilientSenderService;

public class ServiceFactory {
	public ItemRequestService createItemRequestService() {
		return new JxtaItemsSenderService();
	}

	public ResilientRequestService createResilientSxpService()
	{
		return new JxtaResilientSenderService();
	}
}
