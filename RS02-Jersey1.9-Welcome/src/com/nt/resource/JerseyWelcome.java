package com.nt.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/welcome")

public class JerseyWelcome {
	@GET
	public String getMessage() {
		return "Good Morning";
	}

}
