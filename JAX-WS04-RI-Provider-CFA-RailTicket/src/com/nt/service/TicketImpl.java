package com.nt.service;

import javax.jws.WebService;

import com.nt.req.bindings.JourneyInfoType;
import com.nt.req.bindings.PassengerInfoType;
import com.nt.res.bindings.TicketType;

@WebService(endpointInterface="com.nt.service.Ticket")
public class TicketImpl implements Ticket {

	@Override
	public TicketType bookTicket(PassengerInfoType passengerInfo, JourneyInfoType journeyInfo) {
		
		TicketType type=new TicketType();
		type.setPnr(456589751);
		type.setTrainNumber(journeyInfo.getTrainNumber());
		type.setPNAme(passengerInfo.getPNAme());
		type.setPMobile(passengerInfo.getPMobile());
		type.setPAge(passengerInfo.getPAge());
		type.setDoj(journeyInfo.getDoj());
		return type;
	}

}
