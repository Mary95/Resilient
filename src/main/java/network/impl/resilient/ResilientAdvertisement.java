package network.impl.resilient;

import java.util.UUID;
import network.api.annotation.AdvertisementAttribute;
import network.impl.AbstractAdvertisement;
import network.api.advertisement.ResilientAdvertisementInterface;

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
		return "resilient"; 
	}

	@Override
	public String getAdvertisementType() {
		return null;
	}
}
