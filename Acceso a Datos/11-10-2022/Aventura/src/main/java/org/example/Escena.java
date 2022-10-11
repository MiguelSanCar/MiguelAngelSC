package org.example;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

public class Escena {
    int codigo = 0;
    String texto = "";
    ArrayList<opcion> opcion = new ArrayList<opcion>();

    public int getCodigo() {
        return codigo;
    }

    @XmlAttribute(name = "codigo")
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTexto() {
        return texto;
    }

    @XmlElement
    public void setTexto(String texto) {
        this.texto = texto;
    }


    public ArrayList<opcion> getOpcion() {
        return opcion;
    }

    @XmlElement
    public void setOpcion(ArrayList<opcion> opcion) {
        this.opcion = opcion;
    }

    @Override
    public String toString() {
        return "Escena{" +
                "codigo=" + codigo +
                ", texto='" + texto + '\'' +
                //", opcion=" + opcion +
                '}';
    }
}
