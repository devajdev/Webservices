package com.nt.service;

import com.nt.res.bindings.BookResType;

public class BookConsumer {

	public static void main(String[] args) {
		
		BookImplService service=new BookImplService();
		Book book=service.getBookImplPort();
		BookResType type=book.searchBook(101);
		System.out.println("BookId : "+type.getBookId());
		System.out.println("Book Price : "+type.getPrice());
		System.out.println("Book Author : "+type.getAuthor());
		System.out.println("Book Publication : "+type.getPublicationYear());
		

	}

}
