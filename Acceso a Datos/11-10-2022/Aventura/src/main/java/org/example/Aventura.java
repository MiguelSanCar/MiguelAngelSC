package org.example;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name = "aventura")
public class Aventura {
    String titulo = "";
    ArrayList<Escena> escenas = new ArrayList<Escena>();

    @XmlAttribute
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Escena> getEscenas() {
        return escenas;
    }

    @XmlElement(name = "escena")
    public void setEscenas(ArrayList<Escena> escenas) {
        this.escenas = escenas;
    }

    @Override
    public String toString() {
        return "Aventura{" +
                "titulo='" + titulo + '\'' +
                ", escenas=" + escenas +
                '}';
    }
}
