package com.nt.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.nt.req.weather.WeatherReportType;
import com.nt.res.weather.WeatherResponseReportType;


@WebService(name="WeatherReport")
public interface WeatherReport {
	
	@WebMethod(operationName="getWeatherReport")
	public @WebResult(name="response") WeatherResponseReportType getWeatherReport(@WebParam(name="weatherInformation") WeatherReportType type);

}
