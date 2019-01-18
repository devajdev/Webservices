package com.rest.resources.clients;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.model.PassengerInfo;
import com.rest.model.Ticket;

/**
 * This class is for TicketResourceClient using java.net package
 * 
 * @author Ashok
 *
 */
public class TicketResourceNetClient {

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

		// Resource path
		String path = "http://localhost:2525/JAX-RS-Jersey-ERail-RestApp/api/erail";

		// Preparing data to send in POST request body
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
		//System.out.println(passengerJson);

		// send post request to ticket resource
		URL url = new URL(path);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/json");

		conn.setDoOutput(true);

		// write json data to request body
		OutputStream os = conn.getOutputStream();
		os.write(passengerJson.getBytes());
		os.close();

		// capture response
		int code = conn.getResponseCode();
		if (code == 200) {
			InputStreamReader isr = new InputStreamReader(conn.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			System.out.println(br.readLine());
		}
	}

	/**
	 * This method is used to invoke a RestResource method to get Ticket Details
	 * using PNR number
	 * 
	 * @throws Exception
	 */
	public static void getTicketDetails() throws Exception {
		String path = "http://localhost:2525/JAX-RS-Jersey-ERail-RestApp/api/erail/ticket/102";

		URL url = new URL(path);

		// open httpurl connection
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();

		// set request method
		conn.setRequestMethod("GET");

		// set Http Accept Header
		conn.setRequestProperty("Accept", "application/json");

		// getting response code
		int status = conn.getResponseCode();

		if (status == 200) {
			// success
			InputStream is = conn.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			String responseMsg = br.readLine();
			System.out.println(responseMsg);

			// logic to convert json response to java obj
			ObjectMapper mapper = new ObjectMapper();
			Ticket t = mapper.readValue(responseMsg, Ticket.class);
			System.out.println(t);

		} else {
			// failure
			System.out.println("Failure");
		}

	}

}
