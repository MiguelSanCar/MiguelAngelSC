package org.example;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import jdk.internal.util.xml.impl.Input;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.ArrayList;

public class App
{
    public static void main( String[] args ) throws IOException {
        try{
            XMLReader lector = XMLReaderFactory.createXMLReader();
            ParseadorAlumnosSAX parser  = new ParseadorAlumnosSAX();
            lector.setContentHandler(parser);
            InputSource fichero = new InputSource("C:\\Users\\FP\\IdeaProjects\\SAX\\src\\main\\java\\org\\example\\documento.xml");
            lector.parse(fichero);
            ArrayList<Mascota> lista = parser.obtenerResultado();

            System.out.println(lista);


        } catch (SAXException e) {
            System.out.println("Excepción en el procesamiento del XML");
            e.printStackTrace();
        }
    }
}
