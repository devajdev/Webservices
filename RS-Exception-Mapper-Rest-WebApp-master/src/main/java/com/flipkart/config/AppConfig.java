package com.flipkart.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.flipkart.domain.Customer;
import com.flipkart.exception.ErrorMsg;
import com.flipkart.exception.InvalidInputException;
import com.flipkart.exception.InvalidInputExceptionMapper;
import com.flipkart.resources.CustomerResource;

@ApplicationPath("/rest/*")
public class AppConfig extends Application {

	@Override
	public Set<Object> getSingletons() {
		Set<Object> singletons = new HashSet<Object>();
		singletons.add(new CustomerResource());
		return singletons;
	}

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(Customer.class);
		classes.add(InvalidInputException.class);
		classes.add(InvalidInputExceptionMapper.class);
		classes.add(ErrorMsg.class);
		return classes;
	}

}
