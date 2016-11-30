package network.impl.jxta;

//import java.util.*;
import network.impl.jxta.JxtaService;
import network.api.Peer;
import network.api.ResilientService;
import javabase64.*;
//import resilient.impl.ResilientAdvertisement;

public class JxtaResilientService extends JxtaService implements ResilientService{

	//private ResilientAdvertisement init;

	public static final String NAME = "resilient";

	public JxtaResilientService(){
		this.name = NAME;
	}

	private String create_IdUnique(String key) {
		 return Base64.encodeBase64String(key.getBytes());

	}

	public void initAndStart(Peer peer)
	{
		super.initAndStart(peer);
		System.out.println("Bonjour, je suis un service.");
		peerUri = create_IdUnique(peerUri); //String
 /* [AVANT] Exemple Peer_ID : EEEEDE81-FA37-4456-AA9D-C512E2D93FF8

 Public Key : 34bb09f6395b334017890ae9648a6a7b4ff378a1799f8462f61dd4a4c33efc3beadaedcc3b4b95a92a03a8fd99d08d706e260eba4cf3db8e3699918ae4f76f1cf4714d34acc837749b96d0a3607389ded2a4ffbbe349c694e336cbcd072661bf3bce256a9f5561f714ab361df39205a2fadbabf6c3ca2676a213ce03c676f12e */
	}

}
