package org.example;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, SAXException, ParserConfigurationException, ClassNotFoundException {
        System.out.println( "Hello World!" );
        long start = System.currentTimeMillis();
        XMLManager.load(new BankProcessor());
        System.out.println("耗时：" + (System.currentTimeMillis() - start));
    }

}
