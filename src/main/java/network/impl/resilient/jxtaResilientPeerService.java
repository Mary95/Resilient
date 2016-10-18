
public interface jxtaResilientPeerService extends jxtaPeer{
	
	private ResilientPeerAdvertisment init;


	private void create_IdUnique() {
		 publicKey =  UUID.fromString(this.getUri().toString()).toString();
	}
	
}
