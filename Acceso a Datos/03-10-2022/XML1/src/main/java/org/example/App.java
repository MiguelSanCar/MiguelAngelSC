package org.example;

import javafx.scene.transform.Transform;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.swing.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
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

            Element NuevaMascota = documento.createElement("mascota");
            raiz.appendChild(NuevaMascota);
            NuevaMascota.setAttribute("Nombre", "Paquito");
            Element NuevoTipo = documento.createElement("tipo");
            Element NuevaEdad = documento.createElement("edad");
            Element NuevoGenero = documento.createElement("genero");

            NuevoGenero.appendChild(documento.createTextNode("Macho"));
            NuevaEdad.appendChild(documento.createTextNode("12"));
            NuevoTipo.appendChild(documento.createTextNode("Gato"));

            NuevaMascota.appendChild(NuevoGenero);
            NuevaMascota.appendChild(NuevoTipo);
            NuevaMascota.appendChild(NuevaEdad);


            for(int i=0; i<lista.getLength(); i++) {
                Node mascota = lista.item(i);



                NodeList datosMascotas = mascota.getChildNodes();
                Element elemento = (Element) mascota;
                String valNombre = "";
                if (elemento.hasAttribute("Nombre")) {
                    Node nodoNombre = elemento.getAttributeNode("Nombre");
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





            }



            for(Mascota mascota1:mascotas){
                if(mascota1.getNombre() == "Churchill"){
                    mascota1.setGenero("Macho");
                }
                System.out.println(mascota1.toString());
            }




            TransformerFactory TF = TransformerFactory.newInstance();
            Transformer transformer = TF.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");
            DOMSource domSource = new DOMSource(documento);
            StreamResult resultado = new StreamResult(new File ("C:\\Users\\FP\\IdeaProjects\\XML1\\src\\main\\java\\org\\example\\XMLSalida.xml"));
            transformer.transform(domSource, resultado);


        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
