
public interface jxtaResilientPeerService extends jxtaPeer{
	
	private ResilientPeerAdvertisement init;


	private void create_IdUnique() {
		 publicKey =  UUID.fromString(this.getUri().toString()).toString();
	}
	
}
