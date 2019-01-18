package com.nit.apps;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ParseAccountDataUsingDom {

	public static void main(String[] args) throws Exception {
		getElement();

	}
	
	public static void getElement() throws Exception{
		
		//create Dom builder instance
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=factory.newDocumentBuilder();
		//build document
		Document doc=builder.parse("account.xml");
		//normalize the xml structure
		doc.getDocumentElement().normalize();
		//get root node name
		Element rootElement=doc.getDocumentElement();
		System.out.println("root node : "+rootElement.getNodeName());
		//get all element name by tag name
		NodeList nList=doc.getElementsByTagName("account");
		System.out.println("=========");
		visitChildNodes(nList);
	}

	//this method is called recursively
	private static void visitChildNodes(NodeList nList) {
		for(int item=0;item<nList.getLength();item++) {
			Node node=nList.item(item);
			if(node.getNodeType()==node.ELEMENT_NODE);
			System.out.println("Node Name : "+node.getNodeName()+" & value : "+node.getTextContent());
			//check all attribute
			if(node.hasAttributes()) {
				//get attribute name & value
				NamedNodeMap nodeMap=node.getAttributes();
				for(int i=0;i<nodeMap.getLength();i++) {
					Node tempNode=nodeMap.item(i);
					System.out.println("Atrribute Name : "+tempNode.getNodeName()+" & value : "+tempNode.getNodeValue());
				}
				if(node.hasAttributes()) {
					//we got more child element
					visitChildNodes(node.getChildNodes());
				}
			}	
		}	
	}
}
