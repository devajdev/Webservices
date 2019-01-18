package com.nt.service;

import javax.jws.WebService;

import com.nt.req.bindings.BookReqType;
import com.nt.res.bindings.BookResType;
@WebService(endpointInterface="com.nt.service.Book")
public class BookImpl implements Book {

	@Override
	public BookResType searchBook(BookReqType bookId) {
		
		BookResType type=null;
		type=new BookResType();
		
		type.setBookId(bookId.getBookId());
		type.setAuthor("Rod Joshan");
		type.setPrice(500);
		type.setPublicationYear("2010-10-25");
		return type;
	}

}
