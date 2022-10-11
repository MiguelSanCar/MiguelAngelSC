package org.example;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class opcion {
    int id = 0;
    String texto = "";
    //el resultado es el id de la escena a la que redirige
    int resultado = 0;

    public int getId() {
        return id;
    }
    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }
    @XmlAttribute
    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getResultado() {
        return resultado;
    }
    @XmlAttribute
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "opcion{" +
                "id=" + id +
                ", texto='" + texto + '\'' +
                ", resultado=" + resultado +
                '}';
    }
}
