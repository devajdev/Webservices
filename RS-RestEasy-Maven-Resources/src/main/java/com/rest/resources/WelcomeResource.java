package com.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/welcome")
public class WelcomeResource {

	@GET
	public String wish() {
		return "<h1>Welcome to Rest apps with RestEasy..!</Fh1>";

	}

}
