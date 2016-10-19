package network.impl.resilient; 

import java.util.*;
import network.impl.jxta.JxtaService;
import network.api.Peer;

public class jxtaResilientService extends JxtaService implements ResilientService{
	
	private ResilientAdvertisement init;
	public static final String NAME = "ResilientSXP";
	
	public jxtaResilientService(){
		super();
	}


	private String create_IdUnique(String key) {
		 return UUID.fromString(key).toString();
		 
	}
	public void initAndStart(Peer peer)
	{
		super.initAndStart(peer);
		peerUri=create_IdUnique(peerUri);
	}
	
}
