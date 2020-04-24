package org.example;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.lang.reflect.Method;

public class BankHandler extends DefaultHandler {
    private final BankProcessor processor;

    private Bank bank;

    private String value;

    boolean apendFlg = true;

    public BankHandler(BankProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("======================================");
        System.out.println("start qName:" + qName);

        if ("BANKCODE".equals(qName)) {
            bank = new Bank();
        }

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        value = new String(ch, start, length);
        System.out.println(value);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("end qName:" + qName);
        if (value != null
                && !"BANKCODE_COUNT".equals(qName)
                && !qName.toUpperCase().startsWith("CCMS")
                && !"ROW".equals(qName)) {
            try {
                Class bankClass = Class.forName("org.example.Bank");
                String methodName = "set" + qName.toUpperCase().substring(0,1) + qName.toLowerCase().substring(1);
                System.out.println(methodName);
                Method meth = bankClass.getMethod(methodName, String.class);
                meth.invoke(bank, value);
            } catch (Exception e) {
                e.printStackTrace();
            }

            value = null;
        }

        if ("ROW".equals(qName)) {
            try {
                processor.process(bank);
            } catch (Exception e) {
                e.printStackTrace();
            }
            bank = null;
        }

    }
}
