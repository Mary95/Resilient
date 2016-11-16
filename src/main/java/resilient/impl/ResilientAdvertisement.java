package resilient.impl;

import java.util.UUID;
import network.api.annotation.AdvertisementAttribute;
import network.impl.AbstractAdvertisement;
import resilient.api.ResilientAdvertisementInterface;

public class ResilientAdvertisement extends AbstractAdvertisement implements ResilientAdvertisementInterface{

	@AdvertisementAttribute(indexed = true)
	private String publicKey;

	public String getKey() {

		return  publicKey;
	}

	public void setKey(String newKey) {

		publicKey=newKey;
	}

	public String getName()
	{
		return "ResilientSXP";
	}

	@Override
	public String getAdvertisementType() {
		return null;
	}
}
