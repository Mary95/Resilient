package network.impl.resilient; 

import java.util.*;
import network.impl.jxta.JxtaService;
import network.api.Peer;

public class JxtaResilientService extends JxtaService implements ResilientService{
	
	private ResilientAdvertisement init;
	public static final String NAME = "ResilientSXP";
	
	public JxtaResilientService(){
		super();
	}

	/* Permet de créer un id dont la taille est acceptée par le programme via un id unique */
	private String create_IdUnique(String key) {
		 return UUID.fromString(key).toString();
		 
	}
	
	/* met à jour le service afin de modifier la valeur du peer */
	public void initAndStart(Peer peer)
	{
		super.initAndStart(peer);
		peerUri=create_IdUnique(this.peerUri);
		System.out.println(peerUri);
	}
	
}
