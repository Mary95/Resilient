
public interface jxtaResilientPeerService extends Service{

	public static final String NAME = "IdSenders";
	public void sendid(String title, String who, String ...uris);
	
}