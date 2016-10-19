package network.impl.resilient;

import java.util.Collection;

import com.fasterxml.jackson.core.type.TypeReference;

import controller.tools.JsonTools;
import model.entity.Item;
import model.syncManager.ItemSyncManagerImpl;
import net.jxta.pipe.PipeMsgEvent;
import network.api.ItemRequestService;
import network.api.Messages;
import network.impl.MessagesGeneric;
import network.impl.messages.RequestItemMessage;

public class JxtaResilientSenderService extends JxtaService implements ResilientRequestService
{
	public static final String NAME="ResilientSXPSender";

	public void sendRequest(String title, String who, String ...uris)
	{
		RequestItemMessage m = new RequestItemMessage();
		m.setTitle(title);
		m.setWho(who);
		m.setSource(this.peerUri);
		this.sendMessages(m, peerURIs);
	}
}
