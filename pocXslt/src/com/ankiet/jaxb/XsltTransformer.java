package com.ankiet.jaxb;

import java.io.File;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XsltTransformer {
	public static void main(String[] args) {
		
		//xml to xml tranformation
		String XSLFILE = "courses2student.xsl";
		String INFILE  =  "courses.xml";
		String OUTFILE = "student.xml";
		
		StreamSource xslcode = new StreamSource(new File("src/resources/"+XSLFILE));
		StreamSource input = new StreamSource(new File("src/resources/"+INFILE));
		StreamResult output = new StreamResult(new File("src/resources/"+OUTFILE));

		TransformerFactory tf = TransformerFactory.newInstance();
		
		Transformer transformer;
		try {
			transformer = tf.newTransformer(xslcode);
			transformer.transform(input, output);
		} 
		
		catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
		
		// xml to xml transformation ends
		
		
		
		
	}
}
