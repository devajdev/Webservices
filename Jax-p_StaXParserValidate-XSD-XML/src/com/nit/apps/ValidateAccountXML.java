package com.nit.apps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.XMLConstants;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

public class ValidateAccountXML {

	public static void main(String[] args) throws Exception {
		
		Boolean status=validatXML("bank.xsd","account.xml");
		if(status) {
			System.out.println("your XSD & XML are valid ");
			//logic to parse xml
			boolean id = false;
			boolean name = false;
			boolean amt = false;
			
			try {
				// create stax parser factory object
				XMLInputFactory factory = XMLInputFactory.newInstance();
				XMLStreamReader streamReader = factory.createXMLStreamReader(new FileInputStream("account.xml"));
				// checking the element in the stream reader
				while (streamReader.hasNext()) {
					// Get next parsing event
					int eventType = streamReader.next();
					switch (eventType) {

					case XMLStreamConstants.START_ELEMENT:
						// Returns the (local) name of the current event
						String qName = streamReader.getLocalName();
						if (qName.equalsIgnoreCase("bank")) {
							System.out.println("Start elememnt : " + qName);
							// Returns the normalized attribute value of the attribute
							String type = streamReader.getAttributeValue(0);
							System.out.println("Type : " + type);
						} else if (qName.equalsIgnoreCase("id"))
							id = true;
						else if (qName.equalsIgnoreCase("name"))
							name= true;
						else if (qName.equalsIgnoreCase("amt"))
							amt = true;
					
						break;

					case XMLStreamConstants.CHARACTERS:
						//Returns the current value of the parse event as a string
						String characters = streamReader.getText();
						if (id) {
							System.out.println("Id : " + characters);
							id = false;
						}
						if(name) {
							System.out.println("Name : " + characters);
							name = false;
						}
						if (amt) {
							System.out.println("Amt : " + characters);
							amt = false;
						}
						break;

					case XMLStreamConstants.END_ELEMENT:
						String endName = streamReader.getName().getLocalPart();
						if (endName.equalsIgnoreCase("bank")) {
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
		else {
			System.out.println("your XSD & XML are NOT valid ");
		}
	}

	private static Boolean validatXML(String string, String string2) {
		
		try {
			SchemaFactory factory=SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema=factory.newSchema(new File ("bank.xsd"));
			Validator validator=schema.newValidator();
			validator.validate(new StreamSource("account.xml"));
			}
		catch (Exception e) {
			e.printStackTrace();
			return false;	
		}
		return true;
	}
}