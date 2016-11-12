package network.impl.jxta;

import java.util.*;
import network.impl.jxta.JxtaService;
import network.api.Peer;
import network.impl.resilient.ResilientService;
import network.impl.resilient.ResilientAdvertisement;

public class JxtaResilientService extends JxtaService implements ResilientService{

	private ResilientAdvertisement init;
	public static final String NAME = "resilient";

	public JxtaResilientService(){
		this.name = NAME;
	}

	private String create_IdUnique(String key) {
		 return UUID.fromString(key).toString();

	}

	public void initAndStart(Peer peer)
	{
		super.initAndStart(peer);
		peerUri = create_IdUnique(peerUri);
	}

}
