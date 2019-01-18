package com.flipkart.resources;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.flipkart.domain.Customer;
import com.flipkart.exception.InvalidInputException;

@Path("/customer")
public class CustomerResource {

	private static Map<String, Customer> dataStore = new HashMap<String, Customer>();

	@POST
	@Consumes("application/xml")
	public String addCustomer(Customer c) {
		System.out.println("addCustomer() method called");
		System.out.println(c);

		// Add customer record to data store
		if (!dataStore.containsKey(c.getCustomerId())) {
			dataStore.put(c.getCustomerId(), c);
			return "Added Successfully";
		} else {
			return "Customer record is already available";
		}
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Customer getCustomer(@QueryParam("cid") String cid) throws Exception {
		System.out.println("getCustomer() method called");

		if ("".equals(cid) || null == cid) {
			throw new InvalidInputException("Cid is mandatory to get Customer data");
		}

		return dataStore.get(cid);
	}
}
