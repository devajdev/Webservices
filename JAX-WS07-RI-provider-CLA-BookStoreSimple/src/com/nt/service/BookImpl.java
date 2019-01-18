package com.nt.service;

import javax.jws.WebService;

import com.nt.res.bindings.BookResType;
@WebService(endpointInterface="com.nt.service.Book")
public class BookImpl implements Book {

	@Override
	public BookResType searchBook(int bookId) {
		
		BookResType type=new BookResType();
		type.setBookId(bookId);
		type.setAuthor("Richard");
		type.setPrice(500);
		type.setPublicationYear("2015-15-03");
		return type;
	}

}
