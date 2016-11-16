package resilient.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import org.glassfish.jersey.server.ChunkedOutput;

import com.fasterxml.jackson.core.type.TypeReference;

import controller.tools.JsonTools;
import model.api.Manager;
import model.api.ManagerListener;
import model.entity.Item;
import model.factory.ManagerFactory;
import network.api.ItemRequestService;
import network.api.Messages;
import network.api.SearchListener;
import network.api.ServiceListener;
import network.api.service.Service;
import network.impl.advertisement.ItemAdvertisement;
import network.impl.jxta.JxtaItemService;
import network.impl.jxta.JxtaItemsSenderService;
import rest.api.Authentifier;
import rest.api.ServletPath;

@ServletPath("/api/search/*")
@Path("/")

public class JxtaResilientSearchService{


}
