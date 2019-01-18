package com.nt.services;

import javax.jws.WebService;

@WebService(endpointInterface="com.nt.services.GreetMsg")
public class GreetMsgImpl implements GreetMsg {

	@Override
	public String getGreetingMsg(String name) {
		return "Hello..! "+name+" Welcome in WebServices..." ;
	}

}
