package com.rest.resources.clients;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.model.PassengerInfo;
import com.rest.model.Ticket;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * This class is for TicketResourceClient using java.net package
 * 
 * @author Ashok
 *
 */
public class TicketResourceJerseyClient {

	public static void main(String[] args) throws Exception {
		getTicketDetailsInJson();
		//getTicketDetailsInXml();
		//bookTrainTicketWithJson();
		//bookTrainTicketWithXml();
	}

	/**
	 * This method is used to invoke RestResource method to book a ticket
	 * 
	 * @throws Exception
	 */
	public static void bookTrainTicketWithJson() throws Exception {

		// Resource path
		String path = "http://localhost:2525/JAX-RS-Jersey-ERail-RestApp/api/erail";

		// set passenger data
		PassengerInfo pinfo = new PassengerInfo();
		pinfo.setFirstName("Smith");
		pinfo.setLastName("Dean");
		pinfo.setFrom("Hyd");
		pinfo.setTo("Banglore");
		pinfo.setJourneyDate("20-Oct-2018");
		pinfo.setTrainNum("7979");
		pinfo.setGender("Male");
		pinfo.setEmail("smith@gmail.com");

		// convert passenger data to json
		ObjectMapper mapper = new ObjectMapper();
		String passengerJson = mapper.writeValueAsString(pinfo);

		// Create client
		Client client = Client.create();

		// Prepare WebResource
		WebResource resource = client.resource(path);

		// send post request
		ClientResponse response = resource.type("application/json").post(ClientResponse.class, passengerJson);

		// get response status code
		int statusCode = response.getStatus();

		if (statusCode == 200) {
			String resMsg = response.getEntity(String.class);
			System.out.println("******Server Response******");
			System.out.println(resMsg);
		}
	}

	/**
	 * This method is used to invoke RestResource method to book a ticket
	 * 
	 * @throws Exception
	 */
	public static void bookTrainTicketWithXml() throws Exception {

		// Resource path
		String path = "http://localhost:2525/JAX-RS-Jersey-ERail-RestApp/api/erail";

		// set passenger data
		PassengerInfo pinfo = new PassengerInfo();
		pinfo.setFirstName("Smith");
		pinfo.setLastName("Dean");
		pinfo.setFrom("Hyd");
		pinfo.setTo("Banglore");
		pinfo.setJourneyDate("20-Oct-2018");
		pinfo.setTrainNum("7979");
		pinfo.setGender("Male");
		pinfo.setEmail("smith@gmail.com");

		// convert passenger data to xml (Marshalling)
		String xmlString = "";
		StringWriter writer = null;
		writer = new StringWriter();
		JAXBContext jaxbContext = JAXBContext.newInstance(PassengerInfo.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.marshal(pinfo, writer);
		xmlString = writer.toString();
		System.out.println(xmlString);

		// Create client
		Client client = Client.create();

		// Prepare WebResource
		WebResource resource = client.resource(path);

		// send post request
		ClientResponse response = resource.type("application/xml").post(ClientResponse.class, xmlString);

		// get response status code
		int statusCode = response.getStatus();

		if (statusCode == 200) {
			String resMsg = response.getEntity(String.class);
			System.out.println("******Server Response******");
			System.out.println(resMsg);
		}
	}

	/**
	 * This method is used to invoke a RestResource method to get Ticket Details
	 * using PNR number
	 * 
	 * @throws Exception
	 */
	public static void getTicketDetailsInJson() throws Exception {
		String path = "http://localhost:2525/JAX-RS-Jersey-ERail-RestApp/api/erail/ticket/102";

		// create client obj
		Client client = Client.create();

		// Create WebResource
		WebResource resource = client.resource(path);

		// sending GET request with Accept header
		ClientResponse response = resource.accept("application/json").get(ClientResponse.class);

		// Get Response status code
		int statusCode = response.getStatus();

		if (statusCode == 200) {
			// success
			Ticket t = response.getEntity(Ticket.class);
			System.out.println(t);
		}
	}

	/**
	 * This method is used to invoke a RestResource method to get Ticket Details
	 * using PNR number
	 * 
	 * @throws Exception
	 */
	public static void getTicketDetailsInXml() throws Exception {
		String path = "http://localhost:2525/JAX-RS-Jersey-ERail-RestApp/api/erail/ticket/102";

		// create client obj
		Client client = Client.create();

		// Create WebResource
		WebResource resource = client.resource(path);

		// sending GET request with Accept header
		ClientResponse response = resource.accept("application/xml").get(ClientResponse.class);

		// Get Response status code
		int statusCode = response.getStatus();

		if (statusCode == 200) {
			// success
			Ticket t = response.getEntity(Ticket.class);
			System.out.println(t);
		}
	}

}
