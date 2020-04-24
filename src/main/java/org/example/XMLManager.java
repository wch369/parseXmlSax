package org.example;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class XMLManager {
    public static void load(BankProcessor processor) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        // File xmlFile = new File("F:\\learn\\22.xml");
        File xmlFile = new File("F:\\learn\\CCMSZDT0401.XML");
        BankHandler handler = new BankHandler(processor);
        saxParser.parse(xmlFile, handler);
    }
}
