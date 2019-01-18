package com.nt.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.nt.res.bindings.BookResType;
@WebService(name="Book")
public interface Book {
	@WebMethod
	public @WebResult BookResType searchBook(@WebParam(name="bookId") int bookId);

}
