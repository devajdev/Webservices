package com.nt.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.nt.res.bindings.TicketType;
import com.nt.req.bindings.JourneyInfoType;
import com.nt.req.bindings.PassengerInfoType;

@WebService(name="Ticket")
public interface RailBookTicket {
	
	@WebMethod(operationName="bookTicket")
	public @WebResult(name="request") TicketType bookTicket(@WebParam(name="PassengerInfo") PassengerInfoType p,
												@WebParam(name="JourneyInfo") JourneyInfoType j);
}
