package network.impl.resilient;
import network.api.service.Service;
public interface ResilientService extends Service{


	public void sendid(String title, String who, String ...uris);
	
	
}
