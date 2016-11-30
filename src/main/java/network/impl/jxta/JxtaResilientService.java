package network.impl.jxta;


import network.impl.jxta.JxtaService;
import network.api.Peer;
import network.api.ResilientService;

public class JxtaResilientService extends JxtaService implements ResilientService{

	//private ResilientAdvertisement init;

	public static final String NAME = "resilient";

	public JxtaResilientService(){
		this.name = NAME;
	}

	/*private String create_IdUnique(String key) {
		 return java.util.Base64.getEncoder().encodeToString(key.getBytes());
	}*/

	public void initAndStart(Peer peer)
	{
		super.initAndStart(peer);
		//peerUri = create_IdUnique(peerUri);
	}

}
