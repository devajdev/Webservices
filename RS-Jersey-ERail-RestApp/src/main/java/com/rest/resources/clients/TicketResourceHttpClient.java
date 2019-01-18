package com.rest.resources.clients;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.model.PassengerInfo;
import com.rest.model.Ticket;

/**
 * This class is for TicketResourceClient using Apache Http Client
 * 
 * @author Ashok
 *
 */
public class TicketResourceHttpClient {

	public static void main(String[] args) throws Exception {
		getTicketDetails();
		//bookTrainTicket();
	}

	/**
	 * This method is used to invoke RestResource method to book a ticket
	 * 
	 * @throws Exception
	 */
	public static void bookTrainTicket() throws Exception {
		String path = "http://localhost:2525/JAX-RS-Jersey-ERail-RestApp/api/erail";

		// Setting data to obj to send in request body
		PassengerInfo pinfo = new PassengerInfo();
		pinfo.setFirstName("Smith");
		pinfo.setLastName("Dean");
		pinfo.setFrom("Hyd");
		pinfo.setTo("Banglore");
		pinfo.setJourneyDate("20-Oct-2018");
		pinfo.setTrainNum("7979");
		pinfo.setGender("Male");
		pinfo.setEmail("smith@gmail.com");

		// convert java to json
		ObjectMapper mapper = new ObjectMapper();
		String passengerJson = mapper.writeValueAsString(pinfo);
		// System.out.println(passengerJson);

		// Preparing PostRequest with Resource Path
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpPost postRequest = new HttpPost(path);

		// Converting Json data to StringEntity
		StringEntity input = new StringEntity(passengerJson);

		// Setting input to postrequest
		postRequest.setEntity(input);

		// Sending Post request
		HttpResponse response = httpClient.execute(postRequest);

		// checking response status code
		if (response.getStatusLine().getStatusCode() != 201) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
		}

		// Converting response content to BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		// Closing HttpClient
		httpClient.getConnectionManager().shutdown();
	}

	/**
	 * This method is used to invoke a RestResource method to get Ticket Details
	 * using PNR number
	 * 
	 * @throws Exception
	 */
	public static void getTicketDetails() throws Exception {

		// Resource path
		String path = "http://localhost:2525/JAX-RS-Jersey-ERail-RestApp/api/erail/ticket/102";

		// Preparing HttpClient to send request
		DefaultHttpClient httpClient = new DefaultHttpClient();
		
		//Creating GET request object
		HttpGet getRequest = new HttpGet(path);

		// Setting accept format (response format)
		getRequest.addHeader("Accept", "application/json");

		// Executing GET request
		HttpResponse response = httpClient.execute(getRequest);

		// checking response status code
		if (response.getStatusLine().getStatusCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
		}

		// Getting response content
		BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);

			// converting output to java object
			ObjectMapper mapper = new ObjectMapper();
			Ticket t = mapper.readValue(output, Ticket.class);
			System.out.println(t);

		}

		// Closing HttpClient connection manager
		httpClient.getConnectionManager().shutdown();

	}

}
