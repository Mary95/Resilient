package network.impl.resilient;
import network.api.service.Service;

public interface ResilientRequestService extends Service 
{
	public void sendRequest(String title, String who, String ...uris);
	public static final String NAME="ResilientSXPSender";
}
