package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class App
{
    public static void main( String[] args ) throws ParserConfigurationException, IOException, SAXException {

        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

        try{
            DocumentBuilderFactory fabricaCreadorDocumento = DocumentBuilderFactory.newInstance().newInstance();
            DocumentBuilder crearDocumento = fabricaCreadorDocumento.newDocumentBuilder();
            Document documento = crearDocumento.parse("C:\\Users\\FP\\IdeaProjects\\XML1\\src\\main\\java\\org\\example\\mascotas.xml");
            Element raiz = documento.getDocumentElement();
            NodeList lista =  raiz.getElementsByTagName("mascota");

            for(int i=0; i<lista.getLength(); i++) {
                Node mascota = lista.item(i);
                System.out.println("Mascota " + (i+1));
                System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-");

                NodeList datosMascotas = mascota.getChildNodes();
                Element elemento = (Element) mascota;
                String valNombre = "";
                if (elemento.hasAttribute("nombre")) {
                    Node nodoNombre = elemento.getAttributeNode("nombre");
                    valNombre = nodoNombre.getTextContent();
                }
                Node nodoEdad = elemento.getElementsByTagName("edad").item(0);
                int valEdad = Integer.parseInt(nodoEdad.getTextContent());
                Node nodoTipo = elemento.getElementsByTagName("tipo").item(0);
                String valTipo = nodoTipo.getTextContent();
                String valGenero = "Indefinido";
                if(elemento.getElementsByTagName("genero").item(0) != null){
                    Node nodoGenero = elemento.getElementsByTagName("genero").item(0);
                    valGenero = nodoGenero.getTextContent();
                }


                Mascota obj = new Mascota(valNombre, valEdad, valGenero, valTipo);
                mascotas.add(obj);

                System.out.println(mascotas.get(i).toString());


            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
