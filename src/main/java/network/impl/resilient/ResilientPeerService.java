package network.api;
import network.api.service.Service;
public interface ResilientPeerService extends Service{


	public void sendid(String title, String who, String ...uris);
	
	
}
