package com.nt.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name="Greeting Msg")
public interface GreetMsg {
	
	@WebMethod(operationName="WishMsg")
	public @WebResult String getGreetingMsg(@WebParam(name="UserName") String name);

}
