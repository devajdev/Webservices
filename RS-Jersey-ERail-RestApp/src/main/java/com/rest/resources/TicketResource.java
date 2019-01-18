package com.rest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.rest.model.PassengerInfo;
import com.rest.model.Ticket;

/**
 * This is root resource class
 * 
 * @author Ashok
 *
 */
@Path("/erail/")
public class TicketResource {

	/**
	 * This method is used to get Ticket details
	 * 
	 * @param pnr
	 * @return
	 */

	@GET
	@Path("/ticket/{pnr}")
	@Produces({ "application/xml", "application/json" })
	public Ticket getTicketDetails(@PathParam("pnr") String pnr) {
		// logic

		Ticket t = new Ticket();
		t.setFrom("Hyderabad");
		t.setTo("Vizag");
		t.setGeneratedDate("05-Oct-2018");
		t.setJourneyDate("20-Oct-2018");
		t.setPnrNum("456789");
		t.setTicketId("120789");

		return t;
	}

	/**
	 * This method is used to get Ticket status
	 * 
	 * @param pnr
	 * @return
	 */
	@Path("/pnrstatus/{pnr}")
	@GET
	public String getTicketStatus(@PathParam("pnr") String pnr) {
		// logic
		return "CONFIRMED";
	}

	/**
	 * This method is used to book ticket
	 * 
	 * @param pinfo
	 * @return
	 */
	@POST
	@Consumes({ "application/xml", "application/json" })
	public String bookTicket(PassengerInfo pinfo) {
		// logic
		System.out.println(pinfo);
		return "Ticket booked successfully, PNR No:79979";
	}

}
