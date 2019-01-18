package com.nt.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.nt.req.bindings.BookReqType;
import com.nt.res.bindings.BookResType;

@WebService(name="book")
public interface Book {
	@WebMethod(operationName="searchBook")
	public @WebResult(name="Response") BookResType searchBook(@WebParam(name="bookId")BookReqType b);

}
