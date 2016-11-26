package resilient.impl.jxta;

import java.util.*;
import network.impl.jxta.JxtaService;
import network.api.Peer;
import resilient.api.ResilientService;
//import resilient.impl.ResilientAdvertisement;

public class JxtaResilientService extends JxtaService implements ResilientService{

	//private ResilientAdvertisement init;

	public static final String NAME = "resilient";

	public JxtaResilientService(){
		this.name = NAME;
	}

	/*private String create_IdUnique(String key) {
		 return UUID.fromString(key).toString();

	}*/

	public void initAndStart(Peer peer)
	{
		super.initAndStart(peer);
		System.out.println("Bonjour, je suis un service.");
		//peerUri = create_IdUnique(peerUri);
	}

}
