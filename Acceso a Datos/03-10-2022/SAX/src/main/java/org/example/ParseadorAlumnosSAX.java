package org.example;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.management.Attribute;
import java.util.ArrayList;

public class ParseadorAlumnosSAX extends DefaultHandler {

    private ArrayList<Mascota> listado;
    private Mascota mascota;
    private String valorElemento;

    enum tipoNodo{
        MASCOTAS,
        MASCOTA,
        NOMBRE,
        EDAD,
        TIPO,
        GENERO

    }

    public ParseadorAlumnosSAX(){
        super();
    }

    @Override
    public void startDocument() throws SAXException{
        listado = new ArrayList<Mascota>();
    }

    public void startElement(String uri, String localName, String qName, Attributes attributes){
        if(localName != null){
            switch(tipoNodo.valueOf(localName.toUpperCase())){
                case MASCOTA:
                    mascota = new Mascota();
                    String nombre = attributes.getValue("nombre");
                    if(nombre != null){
                        mascota.setNombre(nombre);
                    }
                    break;
            }
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(localName != null){
            switch (tipoNodo.valueOf(localName.toUpperCase())){
                case MASCOTA:
                    listado.add(mascota);
                    break;
                case NOMBRE:
                    mascota.setNombre(valorElemento);
                    break;
                case EDAD:
                    mascota.setEdad(Integer.parseInt(valorElemento));
                    break;
                case TIPO:
                    mascota.setTipo(valorElemento);
                    break;
                case GENERO:
                    mascota.setGenero(valorElemento);
                    break;

            }
        }
    }

    public void characters(char[] ch,int start, int length) throws SAXException{
        valorElemento = new String (ch, start, length);
    }
    public ArrayList<Mascota> obtenerResultado(){
        return listado;
    }
}
