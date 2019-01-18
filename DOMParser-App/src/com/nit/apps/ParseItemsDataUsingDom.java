package com.nit.apps;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ParseItemsDataUsingDom {

	public static void main(String[] args)throws Exception {
		
		//get document builder instance
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=factory.newDocumentBuilder();
		//Build document
		Document doc=builder.parse("items.xml");
		// to access root element
		Element rootElement=doc.getDocumentElement();
		System.out.println("Root Element Name : "+rootElement.getNodeName());
		//get all element name
		NodeList nodeList=doc.getElementsByTagName("item");
		if(nodeList!=null) {
			//System.out.println(nodeList);
			for(int i=0;i<nodeList.getLength();i++) {
				//System.out.println("length "+nodeList.getLength());
				Node node=nodeList.item(i);
				//System.out.println(node);
				if(node.getNodeType()==Document.ELEMENT_NODE);
				Element ele=(Element) node;
				System.out.println("ItemCode : "+ele.getElementsByTagName("itemCode").item(0).getTextContent());
				System.out.println("Quantity : "+ele.getElementsByTagName("quantity").item(0).getTextContent());
			}
		}
	}
}
