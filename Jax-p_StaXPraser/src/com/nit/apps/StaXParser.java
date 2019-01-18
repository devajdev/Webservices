package com.nit.apps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class StaXParser {

	public static void main(String[] args) {

		boolean firstname = false;
		boolean lastname = false;
		boolean role = false;
		boolean age = false;

		try {
			// create stax parser factory object
			XMLInputFactory factory = XMLInputFactory.newInstance();
			XMLStreamReader streamReader = factory.createXMLStreamReader(new FileInputStream("employee.xml"));
			// checking the element in the stream reader
			while (streamReader.hasNext()) {
				// Get next parsing event
				int eventType = streamReader.next();
				switch (eventType) {

				case XMLStreamConstants.START_ELEMENT:
					// Returns the (local) name of the current event
					String qName = streamReader.getLocalName();
					if (qName.equalsIgnoreCase("employee")) {
						System.out.println("Start elememnt : " + qName);
						// Returns the normalized attribute value of the attribute
						String id = streamReader.getAttributeValue(0);
						System.out.println("Id : " + id);
					} else if (qName.equalsIgnoreCase("firstname"))
						firstname = true;
					else if (qName.equalsIgnoreCase("lastname"))
						lastname = true;
					else if (qName.equalsIgnoreCase("role"))
						role = true;
					else if (qName.equalsIgnoreCase("role"))
						age = true;
					break;

				case XMLStreamConstants.CHARACTERS:
					//Returns the current value of the parse event as a string
					String characters = streamReader.getText();
					if (firstname) {
						System.out.println("Fitst Name : " + characters);
						firstname = false;
					}
					if (lastname) {
						System.out.println("last Name : " + characters);
						lastname = false;
					}
					if (role) {
						System.out.println("Role : " + characters);
						role = false;
					}
					if (age) {
						System.out.println("age : " + characters);
						age = false;
					}
					break;

				case XMLStreamConstants.END_ELEMENT:
					String endName = streamReader.getName().getLocalPart();
					if (endName.equalsIgnoreCase("employee")) {
						System.out.println("End Element : " + endName);
						System.out.println();
					}
					break;
				}
			}
		} 
		catch (FileNotFoundException | XMLStreamException e) {
			e.printStackTrace();
		}
	}
}