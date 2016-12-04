package network.impl.jxta;


import network.impl.jxta.JxtaService;
import network.api.Peer;
import network.api.ResilientService;

public class JxtaResilientService extends JxtaService implements ResilientService{

	public static final String NAME = "resilient";

	public JxtaResilientService(){
		this.name = NAME;
	}


	public void initAndStart(Peer peer)
	{
		super.initAndStart(peer);
	}

}
