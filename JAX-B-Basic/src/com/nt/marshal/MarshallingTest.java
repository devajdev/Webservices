package com.nt.marshal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import devaj.hyd.book.BookType;

public class MarshallingTest {

	public static void main(String[] args) {

		try {
			JAXBContext ctx = null;
			// creating the JAXB context
			ctx = JAXBContext.newInstance(BookType.class);
			// creating the marshaler object
			Marshaller mars = ctx.createMarshaller();
			// creating object for BookType class
			BookType type = new BookType();
			// set the value
			type.setName("Devaj");
			type.setPrice(500);
			type.setQuantity(5);
			// calling the marshal method
			mars.marshal(type, new FileOutputStream("book.xml"));

		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try{
		    //getting the xml file to read
		    File file = new File("book.xml");
		    //creating the JAXB context
		    JAXBContext jContext = JAXBContext.newInstance(BookType.class);
		    //creating the unmarshall object
		    Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
		    //calling the unmarshall method
		    BookType book=(BookType) unmarshallerObj.unmarshal(file);
		    System.out.println("Name : "+book.getName()+"\n"+"Price : "+book.getPrice()+"\n"+"Quantity :"+book.getQuantity());
		}catch(Exception e){
		    e.printStackTrace();
		}
	}
}