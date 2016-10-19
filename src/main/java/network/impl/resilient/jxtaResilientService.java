
public class jxtaResilientService extends jxtaService implements ResilientService{
	
	private ResilientPeerAdvertisement init;
	public static final String NAME = "ResilientSXP";

	private String create_IdUnique(String key) {
		 return UUID.fromString(key).toString();
		 
	}
	public void initAndStart(Peer peer)
	{
		super(peer);
		peerUri=create_IdUnique(peerUri);
	}
	
}
