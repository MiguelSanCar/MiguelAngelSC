package org.example;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;

import java.util.ArrayList;

public class IniPreguntas {
    public static void main(String[] args) {
        PreguntaDAO almacenarDAO = new PreguntaDAO();



                                //TEMATICA HISTORIA
        //opciones pregunta1
        ArrayList<Opcion> opciones1 = new ArrayList<Opcion>();
        opciones1.add(new Opcion("Negro", false));
        opciones1.add(new Opcion("Azul", false));
        opciones1.add(new Opcion("Blanco", true));
        opciones1.add(new Opcion("Amarillo", false));

        Pregunta pregunta1 = new Pregunta("De que color es el caballo blanco de santiago", opciones1, "historia");

        almacenarDAO.almacenar(pregunta1);

        //opciones pregunta2
        ArrayList<Opcion> opciones2 = new ArrayList<Opcion>();
        opciones2.add(new Opcion("2001", false));
        opciones2.add(new Opcion("2000", false));
        opciones2.add(new Opcion("2019", false));
        opciones2.add(new Opcion("Ninguna de las anteriores es correcta", true));

        Pregunta pregunta2 = new Pregunta("En que año estas", opciones2, "historia");

        almacenarDAO.almacenar(pregunta2);

        //opciones pregunta3
        ArrayList<Opcion> opciones3 = new ArrayList<Opcion>();
        opciones3.add(new Opcion("1776", true));
        opciones3.add(new Opcion("1778", false));
        opciones3.add(new Opcion("1800", false));
        opciones3.add(new Opcion("Ninguna de las anteriores es correcta", false));

        Pregunta pregunta3 = new Pregunta("En que año se fundó EEUU?", opciones3, "historia");

        almacenarDAO.almacenar(pregunta3);

        //opciones pregunta4
        ArrayList<Opcion> opciones4 = new ArrayList<Opcion>();
        opciones4.add(new Opcion("Neolítico", true));
        opciones4.add(new Opcion("Edad Media", false));
        opciones4.add(new Opcion("Paleolítico", false));
        opciones4.add(new Opcion("Ninguna de las anteriores es correcta", false));

        Pregunta pregunta4 = new Pregunta("El periodo en el que aparecieron la agricultura y los asentamientos sedentarios se llama", opciones4, "historia");

        almacenarDAO.almacenar(pregunta4);

        //opciones pregunta5
        ArrayList<Opcion> opciones5 = new ArrayList<Opcion>();
        opciones5.add(new Opcion("Hace 20 mil años", false));
        opciones5.add(new Opcion("En el IV milenio a.C", true));
        opciones5.add(new Opcion("En el año 0", false));
        opciones5.add(new Opcion("En 2018 d.C", false));

        Pregunta pregunta5 = new Pregunta("¿Cuándo se inventó la escritura?", opciones5, "historia");

        almacenarDAO.almacenar(pregunta5);



                            //TEMATICA ACTUALIDAD
        //opciones pregunta6
        ArrayList<Opcion> opciones6 = new ArrayList<Opcion>();
        opciones6.add(new Opcion("Si", true));
        opciones6.add(new Opcion("Casi", false));
        opciones6.add(new Opcion("No", false));
        opciones6.add(new Opcion("Todas las anteriores son correctas", false));

        Pregunta pregunta6 = new Pregunta("RikiPlatas es tonto?", opciones6, "actualidad");

        almacenarDAO.almacenar(pregunta6);

        //opciones pregunta7
        ArrayList<Opcion> opciones7 = new ArrayList<Opcion>();
        opciones7.add(new Opcion("Gavi del Barça", true));
        opciones7.add(new Opcion("Iker Casillas", false));
        opciones7.add(new Opcion("Conmigo", false));
        opciones7.add(new Opcion("Todas las anteriores son correctas", false));

        Pregunta pregunta7 = new Pregunta("Con quién está liada la princesa Leonor?", opciones7, "actualidad");

        almacenarDAO.almacenar(pregunta7);


        //opciones pregunta8
        ArrayList<Opcion> opciones8 = new ArrayList<Opcion>();
        opciones8.add(new Opcion("Brasil", false));
        opciones8.add(new Opcion("Alemania", false));
        opciones8.add(new Opcion("Argentina", true));
        opciones8.add(new Opcion("Francia", false));

        Pregunta pregunta8 = new Pregunta("Quién acaba de ganar la copa del mundo de Futbol?", opciones8, "actualidad");

        almacenarDAO.almacenar(pregunta8);


        //opciones pregunta9
        ArrayList<Opcion> opciones9 = new ArrayList<Opcion>();
        opciones9.add(new Opcion("Si", false));
        opciones9.add(new Opcion("Si, solo si lo dice suso", true));
        opciones9.add(new Opcion("No", false));
        opciones9.add(new Opcion("Ninguna de las anteriores es correcta", false));

        Pregunta pregunta9 = new Pregunta("Es lo mismo 'al mismo tiempo' que 'simultaneamente'?", opciones9, "actualidad");

        almacenarDAO.almacenar(pregunta9);


    }
}