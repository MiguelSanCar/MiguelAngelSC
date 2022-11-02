package org.example;

import com.sun.xml.internal.org.jvnet.mimepull.CleanUpExecutorFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */

public class App
{
    //booleano para confirmar si el usuario tiene vendas
    public static boolean vendas = false;
    //booleano para confirmar si el usuario está herido
    public static boolean herida = false;

    //contador de turnos hasta morir por infección
    public static int contHerida = 0;

    //booleano para si el usuario tiene arma
    public static boolean arma = false;

    //eleccion de las opciones del usuario
    public static int eleccion = 0;


    public static void main( String[] args ) throws JAXBException, InterruptedException {
        Scanner teclado = new Scanner(System.in);

        //selector de aventuras
        int elegirAventura = 0;

        //contador para contar los turnos, al llegar a cierto número, el juego se acaba por tiempo
        int cont = 0;

        do {
            System.out.println("Selecciona una aventura de las siguientes:");
            System.out.println("0. Salir");
            System.out.println("1. 'Death Stories'");
            elegirAventura = teclado.nextInt();

            if (elegirAventura < 0 || elegirAventura > 1) {
                System.out.println("Por favor, elige un número dentro del rango");
            }
        } while (elegirAventura > 1 || elegirAventura < 0);

        switch (elegirAventura) {
            case 1:
                Aventura escena = realizarlLecturaXML("C:\\Users\\FP\\IdeaProjects\\Aventura\\src\\main\\java\\org\\example\\Escenas.xml");

                System.out.println(escena);

                int numEscena = 0;

                //numero aleatorio
                int random = 0;

                //fin de partida para los finales que no son por tiempo
                boolean finpartida = false;

                Thread.sleep(3500);
                System.out.println("\n\n\n");
                Thread.sleep(450);
                System.out.println("\n\n\n");
                Thread.sleep(400);
                System.out.println("\n\n\n");
                Thread.sleep(300);
                System.out.println("\n\n\n");
                Thread.sleep(200);
                System.out.println("\n\n\n");
                Thread.sleep(100);
                System.out.println("\n\n\n");
                Thread.sleep(100);
                System.out.println("\n\n\n");
                Thread.sleep(100);
                System.out.println("\n\n\n");
                Thread.sleep(75);
                System.out.println("\n\n\n");
                Thread.sleep(50);
                System.out.println("\n\n\n");


                System.out.println("\t\t\t▓█████▄ ▓█████ ▄▄▄     ▄▄▄█████▓ ██░ ██      ██████ ▄▄▄█████▓ ▒█████   ██▀███   ██▓▓█████   ██████");
                System.out.println("\t\t\t▒██▀ ██▌▓█   ▀▒████▄   ▓  ██▒ ▓▒▓██░ ██▒   ▒██    ▒ ▓  ██▒ ▓▒▒██▒  ██▒▓██ ▒ ██▒▓██▒▓█   ▀ ▒██    ▒");
                System.out.println("\t\t\t░██   █▌▒███  ▒██  ▀█▄ ▒ ▓██░ ▒░▒██▀▀██░   ░ ▓██▄   ▒ ▓██░ ▒░▒██░  ██▒▓██ ░▄█ ▒▒██▒▒███   ░ ▓██▄");
                System.out.println("\t\t\t░██   █▌▒███  ▒██  ▀█▄ ▒ ▓██░ ▒░▒██▀▀██░   ░ ▓██▄   ▒ ▓██░ ▒░▒██░  ██▒▓██ ░▄█ ▒▒██▒▒███   ░ ▓██▄");
                System.out.println("\t\t\t░▓█▄   ▌▒▓█  ▄░██▄▄▄▄██░ ▓██▓ ░ ░▓█ ░██      ▒   ██▒░ ▓██▓ ░ ▒██   ██░▒██▀▀█▄  ░██░▒▓█  ▄   ▒   ██▒");
                System.out.println("\t\t\t░▒████▓ ░▒████▒▓█   ▓██▒ ▒██▒ ░ ░▓█▒░██▓   ▒██████▒▒  ▒██▒ ░ ░ ████▓▒░░██▓ ▒██▒░██░░▒████▒▒██████▒▒");
                System.out.println("\t\t\t ▒▒▓  ▒ ░░ ▒░ ░▒▒   ▓▒█░ ▒ ░░    ▒ ░░▒░▒   ▒ ▒▓▒ ▒ ░  ▒ ░░   ░ ▒░▒░▒░ ░ ▒▓ ░▒▓░░▓  ░░ ▒░ ░▒ ▒▓▒ ▒ ░");
                System.out.println("\t\t\t ░ ▒  ▒  ░ ░  ░ ▒   ▒▒ ░   ░     ▒ ░▒░ ░   ░ ░▒  ░ ░    ░      ░ ▒ ▒░   ░▒ ░ ▒░ ▒ ░ ░ ░  ░░ ░▒  ░ ░");
                System.out.println("\t\t\t ░ ░  ░    ░    ░   ▒    ░       ░  ░░ ░   ░  ░  ░    ░      ░ ░ ░ ▒    ░░   ░  ▒ ░   ░   ░  ░  ░");
                System.out.println("\t\t\t   ░       ░  ░     ░  ░         ░  ░  ░         ░               ░ ░     ░      ░     ░  ░      ░");
                System.out.println("\t\t\t ░\n\n\n\n\n");


                while (!finpartida && cont < 20) {

                    if (cont < 20) {
                        eleccion = 0;
                        for (Escena escenaActual : escena.getEscenas()) {
                            if (escenaActual.getCodigo() == numEscena) {
                                System.out.println(escenaActual.texto);
                                if (escenaActual.getCodigo() == 18) {
                                    System.out.println("\n\n");
                                    System.out.println("Despues de mucho tiempo, has conseguido sobrevivir, por ahora\n");

                                    Thread.sleep(5000);
                                    System.out.println("\n\n");

                                    System.out.println();
                                    System.out.println("                                                                                                          ");
                                    System.out.println("  .g8\"\"\"bgd       db      `7MMM.     ,MMF'`7MM\"\"\"YMM        .g8\"\"8q.`7MMF'   `7MF'`7MM\"\"\"YMM  `7MM\"\"\"Mq.  ");
                                    System.out.println(".dP'     `M      ;MM:       MMMb    dPMM    MM    `7      .dP'    `YM.`MA     ,V    MM    `7    MM   `MM. ");
                                    System.out.println("dM'       `     ,V^MM.      M YM   ,M MM    MM   d        dM'      `MM VM:   ,V     MM   d      MM   ,M9  ");
                                    System.out.println("MM             ,M  `MM      M  Mb  M' MM    MMmmMM        MM        MM  MM.  M'     MMmmMM      MMmmdM9   ");
                                    System.out.println("MM.    `7MMF'  AbmmmqMA     M  YM.P'  MM    MM   Y  ,     MM.      ,MP  `MM A'      MM   Y  ,   MM  YM.   ");
                                    System.out.println("`Mb.     MM   A'     VML    M  `YM'   MM    MM     ,M     `Mb.    ,dP'   :MM;       MM     ,M   MM   `Mb. ");
                                    System.out.println("  `\"bmmmdPY .AMA.   .AMMA..JML. `'  .JMML..JMMmmmmMMM       `\"bmmd\"'      VF      .JMMmmmmMMM .JMML. .JMM.");
                                    System.out.println("                                                                                                          ");
                                    finpartida = true;

                                } else if (numEscena == 20) {
                                    random = (int) (Math.random() * 2 + 1);
                                    if (random == 1) {
                                        System.out.println("\n\n");
                                        System.out.println("Mala suerte, un zombi ha aparecido y se te ha comido mientras dorías\n");

                                        Thread.sleep(5000);
                                        System.out.println("\n\n");

                                        System.out.println();
                                        System.out.println("                                                                                                          ");
                                        System.out.println("  .g8\"\"\"bgd       db      `7MMM.     ,MMF'`7MM\"\"\"YMM        .g8\"\"8q.`7MMF'   `7MF'`7MM\"\"\"YMM  `7MM\"\"\"Mq.  ");
                                        System.out.println(".dP'     `M      ;MM:       MMMb    dPMM    MM    `7      .dP'    `YM.`MA     ,V    MM    `7    MM   `MM. ");
                                        System.out.println("dM'       `     ,V^MM.      M YM   ,M MM    MM   d        dM'      `MM VM:   ,V     MM   d      MM   ,M9  ");
                                        System.out.println("MM             ,M  `MM      M  Mb  M' MM    MMmmMM        MM        MM  MM.  M'     MMmmMM      MMmmdM9   ");
                                        System.out.println("MM.    `7MMF'  AbmmmqMA     M  YM.P'  MM    MM   Y  ,     MM.      ,MP  `MM A'      MM   Y  ,   MM  YM.   ");
                                        System.out.println("`Mb.     MM   A'     VML    M  `YM'   MM    MM     ,M     `Mb.    ,dP'   :MM;       MM     ,M   MM   `Mb. ");
                                        System.out.println("  `\"bmmmdPY .AMA.   .AMMA..JML. `'  .JMML..JMMmmmmMMM       `\"bmmd\"'      VF      .JMMmmmmMMM .JMML. .JMM.");
                                        System.out.println("                                                                                                          ");
                                        finpartida = true;
                                    } else {
                                        System.out.println("\n\n");
                                        System.out.println("Por suerte consigues sobrevivir, continúas con vida, por ahora\n");

                                    }
                                } else if (numEscena == 23) {
                                    System.out.println("\n\n");
                                    System.out.println("Ahora la fuente del mal olor eres tú, ¿irónico no?\n");

                                    Thread.sleep(5000);
                                    System.out.println("\n\n");

                                    System.out.println();
                                    System.out.println("                                                                                                          ");
                                    System.out.println("  .g8\"\"\"bgd       db      `7MMM.     ,MMF'`7MM\"\"\"YMM        .g8\"\"8q.`7MMF'   `7MF'`7MM\"\"\"YMM  `7MM\"\"\"Mq.  ");
                                    System.out.println(".dP'     `M      ;MM:       MMMb    dPMM    MM    `7      .dP'    `YM.`MA     ,V    MM    `7    MM   `MM. ");
                                    System.out.println("dM'       `     ,V^MM.      M YM   ,M MM    MM   d        dM'      `MM VM:   ,V     MM   d      MM   ,M9  ");
                                    System.out.println("MM             ,M  `MM      M  Mb  M' MM    MMmmMM        MM        MM  MM.  M'     MMmmMM      MMmmdM9   ");
                                    System.out.println("MM.    `7MMF'  AbmmmqMA     M  YM.P'  MM    MM   Y  ,     MM.      ,MP  `MM A'      MM   Y  ,   MM  YM.   ");
                                    System.out.println("`Mb.     MM   A'     VML    M  `YM'   MM    MM     ,M     `Mb.    ,dP'   :MM;       MM     ,M   MM   `Mb. ");
                                    System.out.println("  `\"bmmmdPY .AMA.   .AMMA..JML. `'  .JMML..JMMmmmmMMM       `\"bmmd\"'      VF      .JMMmmmmMMM .JMML. .JMM.");
                                    System.out.println("                                                                                                          ");

                                    finpartida = true;

                                } else {
                                    for (Opcion opcion1 : escenaActual.getOpcion()) {
                                        System.out.println(opcion1.getId() + "- " + opcion1.getTexto());
                                    }


                                }
                            }

                        }
                    }
                    do {
                        eleccion = teclado.nextInt();
                        cont++;

                        vendas = romperChaqueta(escena, numEscena, eleccion);
                        herida = estarHerido(escena, numEscena, eleccion);
                        ponervendas(escena, numEscena);
                        salirSinArma(escena, numEscena, eleccion);
                        cont = ponerChaqueta(escena, numEscena, eleccion, cont);
                        cont = comerLata(escena, eleccion, cont);
                        cont = suerteBosque(escena, numEscena, eleccion, cont);
                        cont = descansar(escena, numEscena, eleccion, cont);

                        numEscena = realizarEleccion(numEscena, escena, eleccion);

                        if (herida == true) {
                            contHerida++;
                        }
                        if (eleccion < 1 || eleccion > 3) {
                            System.out.println("Su elección debe estar dentro de los números indicados, por favor, introduzca un número dentro de los aceptados");
                        }

                    } while (eleccion > 3 || eleccion < 0);


                }
                if (numEscena == 23) {
                    System.out.println("\n\n");
                    System.out.println("Ahora la fuente del mal olor eres tú, ¿irónico no?\n");

                    Thread.sleep(3000);
                    System.out.println("\n\n");

                    System.out.println();
                    System.out.println("                                                                                                          ");
                    System.out.println("  .g8\"\"\"bgd       db      `7MMM.     ,MMF'`7MM\"\"\"YMM        .g8\"\"8q.`7MMF'   `7MF'`7MM\"\"\"YMM  `7MM\"\"\"Mq.  ");
                    System.out.println(".dP'     `M      ;MM:       MMMb    dPMM    MM    `7      .dP'    `YM.`MA     ,V    MM    `7    MM   `MM. ");
                    System.out.println("dM'       `     ,V^MM.      M YM   ,M MM    MM   d        dM'      `MM VM:   ,V     MM   d      MM   ,M9  ");
                    System.out.println("MM             ,M  `MM      M  Mb  M' MM    MMmmMM        MM        MM  MM.  M'     MMmmMM      MMmmdM9   ");
                    System.out.println("MM.    `7MMF'  AbmmmqMA     M  YM.P'  MM    MM   Y  ,     MM.      ,MP  `MM A'      MM   Y  ,   MM  YM.   ");
                    System.out.println("`Mb.     MM   A'     VML    M  `YM'   MM    MM     ,M     `Mb.    ,dP'   :MM;       MM     ,M   MM   `Mb. ");
                    System.out.println("  `\"bmmmdPY .AMA.   .AMMA..JML. `'  .JMML..JMMmmmmMMM       `\"bmmd\"'      VF      .JMMmmmmMMM .JMML. .JMM.");
                    System.out.println("                                                                                                          ");

                    finpartida = true;

                }
                if (cont > 18) {
                    System.out.println("\n\n");
                    System.out.println("Has jugado demasiado con el tiempo, los zombis te han rodeado sin darte cuenta y es tu último momento de vida.\n" +
                            "Recuerdas cada elección que has tomado, te preguntas si habrá alguna forma de sobrevivir\n");

                    Thread.sleep(1000);
                    System.out.println("\n\n");

                    System.out.println("                                                                                                          ");
                    System.out.println("  .g8\"\"\"bgd       db      `7MMM.     ,MMF'`7MM\"\"\"YMM        .g8\"\"8q.`7MMF'   `7MF'`7MM\"\"\"YMM  `7MM\"\"\"Mq.  ");
                    System.out.println(".dP'     `M      ;MM:       MMMb    dPMM    MM    `7      .dP'    `YM.`MA     ,V    MM    `7    MM   `MM. ");
                    System.out.println("dM'       `     ,V^MM.      M YM   ,M MM    MM   d        dM'      `MM VM:   ,V     MM   d      MM   ,M9  ");
                    System.out.println("MM             ,M  `MM      M  Mb  M' MM    MMmmMM        MM        MM  MM.  M'     MMmmMM      MMmmdM9   ");
                    System.out.println("MM.    `7MMF'  AbmmmqMA     M  YM.P'  MM    MM   Y  ,     MM.      ,MP  `MM A'      MM   Y  ,   MM  YM.   ");
                    System.out.println("`Mb.     MM   A'     VML    M  `YM'   MM    MM     ,M     `Mb.    ,dP'   :MM;       MM     ,M   MM   `Mb. ");
                    System.out.println("  `\"bmmmdPY .AMA.   .AMMA..JML. `'  .JMML..JMMmmmmMMM       `\"bmmd\"'      VF      .JMMmmmmMMM .JMML. .JMM.");
                    System.out.println("                                                                                                          ");

                }
                if (contHerida > 5) {
                    System.out.println("\n\n");
                    System.out.println("Tu herida es peor de lo que pensabas y caes desangrado, quizá no has tomado las mejores decisiones...\n");

                    Thread.sleep(1000);
                    System.out.println("\n\n");

                    System.out.println("                                                                                                          ");
                    System.out.println("  .g8\"\"\"bgd       db      `7MMM.     ,MMF'`7MM\"\"\"YMM        .g8\"\"8q.`7MMF'   `7MF'`7MM\"\"\"YMM  `7MM\"\"\"Mq.  ");
                    System.out.println(".dP'     `M      ;MM:       MMMb    dPMM    MM    `7      .dP'    `YM.`MA     ,V    MM    `7    MM   `MM. ");
                    System.out.println("dM'       `     ,V^MM.      M YM   ,M MM    MM   d        dM'      `MM VM:   ,V     MM   d      MM   ,M9  ");
                    System.out.println("MM             ,M  `MM      M  Mb  M' MM    MMmmMM        MM        MM  MM.  M'     MMmmMM      MMmmdM9   ");
                    System.out.println("MM.    `7MMF'  AbmmmqMA     M  YM.P'  MM    MM   Y  ,     MM.      ,MP  `MM A'      MM   Y  ,   MM  YM.   ");
                    System.out.println("`Mb.     MM   A'     VML    M  `YM'   MM    MM     ,M     `Mb.    ,dP'   :MM;       MM     ,M   MM   `Mb. ");
                    System.out.println("  `\"bmmmdPY .AMA.   .AMMA..JML. `'  .JMML..JMMmmmmMMM       `\"bmmd\"'      VF      .JMMmmmmMMM .JMML. .JMM.");
                    System.out.println("                                                                                                          ");

                }


                break;
            case 0:
                System.out.println("Saliendo del programa...");
                Thread.sleep(1000);
                break;


        }






    }
    private static void romperMesa(Aventura escena, int numEscena, int eleccion) throws InterruptedException {
        if(escena.getEscenas().get(numEscena).getCodigo() == 1 && eleccion == 1) {
            arma = true;
            herida = true;
        }
    }

    private static void salirSinArma(Aventura escena, int numEscena, int eleccion) throws InterruptedException {
        if(escena.getEscenas().get(numEscena).getCodigo() == 1 && eleccion == 2 || escena.getEscenas().get(numEscena).getCodigo() == 6 && eleccion == 2) {
            System.out.println("Sales de la casa con prisa, quién necesita armas teniendo un par de puños.");
        }
    }
    private static boolean estarHerido(Aventura escena, int numEscena, int eleccion) throws InterruptedException {
        if(escena.getEscenas().get(numEscena).getCodigo() == 7 ) {

            return true;
        }else{
            return false;
        }
    }


    //Ponerse la chaqueta te hace tener más fatiga, el contador del tiempo aumenta en 5, lo que hace que muera antes
    private static int ponerChaqueta(Aventura escena, int numEscena, int eleccion, int cont) throws InterruptedException {
        if(escena.getEscenas().get(numEscena).getCodigo() == 2 && eleccion == 3) {
            System.out.println("Te pones la chaqueta, puede que te canses más rápido, pero deberías estar más protegido");
            cont = cont + 3;
            return cont;
        }
        else{
            return cont;
        }
    }

    //por comer la lata te sientes mas gordo y aumentan los turnos
    private static int comerLata(Aventura escena, int numEscena, int cont) throws InterruptedException {
        if(escena.getEscenas().get(numEscena).getCodigo() == 10) {
            cont = cont + 3;
            return cont;
        }
        else{
            return cont;
        }
    }
    private static int descansar(Aventura escena, int numEscena, int eleccion, int cont) throws InterruptedException {
        if(escena.getEscenas().get(numEscena).getCodigo() == 10 && eleccion == 1 || escena.getEscenas().get(numEscena).getCodigo() == 16 && eleccion == 3 || escena.getEscenas().get(numEscena).getCodigo() == 21) {
            cont = cont + 5;
            return cont;
        }
        else{
            return cont;
        }
    }

    //en caso de despertar en el bosque, el tiempo se sumará en 8
    private static int suerteBosque(Aventura escena, int numEscena, int eleccion, int cont) throws InterruptedException {
        if( escena.getEscenas().get(numEscena).getCodigo() == 21) {
            cont = cont + 8;
            return cont;
        }
        else{
            return cont;
        }
    }

    //En caso de tener vendas se cura la herida, en caso de que no, la herida se infectará más adelante
    private static boolean ponervendas(Aventura escena, int numEscena) throws InterruptedException {
        if(escena.getEscenas().get(numEscena).getCodigo() == 7 && eleccion == 1 && vendas == true){
            System.out.println("Te curas las heridas con las vendas caseras");
            herida = false;
            contHerida = 0;
            return false;
        }else if(escena.getEscenas().get(numEscena).getCodigo() == 7 && eleccion == 1 && vendas == false){
            System.out.println("                    Miras tus bolsillos y la mochila, pero no tienes vendas");

            Thread.sleep(2000);
            eleccion = 2;
            return false;
        }
        return false;
        }
    private static boolean romperChaqueta(Aventura escena, int numEscena, int eleccion){
        if(escena.getEscenas().get(numEscena).getCodigo() == 2 && eleccion == 2){
            return true;
        }
        else{
            return vendas;
        }
    }


    private static int realizarEleccion(int numEscena, Aventura escena, int eleccion){

        Escena escenaActual = null;

        for(Escena escena1:escena.getEscenas()){
            if(escena1.getCodigo() == numEscena){
                escenaActual = escena1;
            }
        }
        for(Opcion opcion1: escenaActual.getOpcion() ){
            if(opcion1.getId() == eleccion){
                return opcion1.getResultado();
            }
        }
        return 0;

    }
    private static Aventura realizarlLecturaXML(String ruta) throws JAXBException {
        Aventura aventura = null;


        File file = new File(ruta);
        if (file.exists()) {
            JAXBContext jaxbContext = JAXBContext.newInstance(Aventura.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            aventura = (Aventura) jaxbUnmarshaller.unmarshal(file);
            //System.out.println(aventura);

        } else {
            System.out.println("No se ha podido encontrar el fichero indicado");
        }

        return aventura;
    }
}
