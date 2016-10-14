package network.impl.advertisement;

import java.util.UUID;
import network.api.advertisement.PeerAdvertisementInterface;
import network.api.annotation.AdvertisementAttribute;
import network.impl.AbstractAdvertisement;

public class ResilientPeerAdvertisement extends PeerAdvertisement implements UserAdvertisementInterface{
	
	@AdvertisementAttribute(indexed = true)
	private String publicKey;

	public void setKey(Peer peer) {
		 publicKey =  UUID.fromString(peer.getUri().toString()).toString();
	}
	
	@Override
	public String getKey() {
		return  null;
	}

	@Override
	public String getAdvertisementType(Peer peer) {
			return null;
	}
}