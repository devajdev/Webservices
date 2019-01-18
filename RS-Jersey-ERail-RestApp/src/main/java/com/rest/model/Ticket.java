package com.rest.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Ticket {

	private String ticketId;
	private String pnrNum;
	private String generatedDate;
	private String from;
	private String to;
	private String journeyDate;

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getPnrNum() {
		return pnrNum;
	}

	public void setPnrNum(String pnrNum) {
		this.pnrNum = pnrNum;
	}

	public String getGeneratedDate() {
		return generatedDate;
	}

	public void setGeneratedDate(String generatedDate) {
		this.generatedDate = generatedDate;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", pnrNum=" + pnrNum + ", generatedDate=" + generatedDate + ", from="
				+ from + ", to=" + to + ", journeyDate=" + journeyDate + "]";
	}

}
