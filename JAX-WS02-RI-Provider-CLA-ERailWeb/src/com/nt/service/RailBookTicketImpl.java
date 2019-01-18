package com.nt.service;

import javax.jws.WebService;

import com.nt.req.bindings.JourneyInfoType;
import com.nt.req.bindings.PassengerInfoType;
import com.nt.res.bindings.TicketType;

@WebService(endpointInterface="com.nt.service.RailBookTicket")
public class RailBookTicketImpl implements RailBookTicket {

	@Override
	public TicketType bookTicket(PassengerInfoType p, JourneyInfoType j) {
		//creating obj of response ticket
		TicketType type=new TicketType();
		type.setPnr(459845635);
		type.setPNAme(p.getPNAme());
		type.setPAge(p.getPAge());
		type.setPMobile(p.getPMobile());
		type.setDoj(j.getDoj());
		type.setTrainNumber(j.getTrainNumber());
		return type;
	}//method close
}//class
