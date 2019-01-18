package com.nt.service;

import javax.jws.WebService;

import com.nt.req.weather.WeatherReportType;
import com.nt.res.weather.WeatherResponseReportType;
@WebService(endpointInterface="com.nt.service.WeatherReportImpl")
public class WeatherReportImpl implements WeatherReport {

	@Override
	public WeatherResponseReportType getWeatherReport(WeatherReportType type) {
		
		WeatherResponseReportType type1=new WeatherResponseReportType();
		type1.setZipCode(type.getZipCode());
		type1.setCity(type.getCity());
		type1.setCountry(type.getCountry());
		int zipCode=0;
		zipCode=type.getZipCode();
		if(zipCode==500016)
			type1.setTemp(27.45);
		return type1;
	}

	


}
