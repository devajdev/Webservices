package com.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
@Path("/paytm")
public class PaytmResource {
	
	public PaytmResource() {
		System.out.println("BalanceCheck.BalanceCheck()");
	}
	
	@GET
	//@Path("/bal")
	public String getWalletBalance() {
		// business logic
		System.out.println("Hello");
		return "<h1>Balnace : 500.00</h1>";
	}

}
