package com.flipkart.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class InvalidInputExceptionMapper implements ExceptionMapper<InvalidInputException> {

	public Response toResponse(InvalidInputException e) {

		ErrorMsg err = new ErrorMsg(400, e.getMessage());

		return Response.status(Status.BAD_REQUEST)
				.entity(err)
				.type("application/xml")
				.build();
				
	}

}
