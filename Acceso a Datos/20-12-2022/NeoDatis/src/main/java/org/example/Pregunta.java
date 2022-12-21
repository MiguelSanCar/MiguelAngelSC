package org.example;

import java.util.ArrayList;

public class Pregunta {

    String texto;
    ArrayList<Opcion> opcion;
    String tematica;

    public Pregunta(String texto, ArrayList<Opcion> opcion, String tematica) {
        this.texto = texto;
        this.opcion = opcion;
        this.tematica = tematica;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public ArrayList<Opcion> getOpcion() {
        return opcion;
    }

    public void setOpcion(ArrayList<Opcion> opcion) {
        this.opcion = opcion;
    }

    @Override
    public String toString() {
        return "Pregunta{" +
                "texto='" + texto + '\'' +
                ", opcion=" + opcion +
                ", tematica='" + tematica + '\'' +
                '}';
    }
}
