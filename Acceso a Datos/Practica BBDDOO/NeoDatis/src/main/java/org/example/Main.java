package org.example;

import java.awt.image.SampleModel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner teclado = new Scanner(System.in);

        PreguntaDAO preguntaDAO = new PreguntaDAO();


        String elegirModo = "";
        String tematica = "";
        int respuestaPregunta = 0;



        System.out.println("Bienvenido al juego de preguntas más facil del mundo");
        System.out.println("Introduce el modo de juego deseado [UN JUGADOR] -> 1 [MULTIJUGADOR] -> 2 (Fase BETA, el multijugador no está implementado)");
            elegirModo = teclado.next();

            //este if es porque aun no esta implementado el modo multijugador
            if(elegirModo.equals(2)){
                elegirModo = "1";
            }


        //variables del juego
        int cont = 0;
        //modo un jugador
        if(elegirModo.equals("1")){
            System.out.println("Has elegido el modo de juego [UN JUGADOR]");

            System.out.println("Escoja una temática");
            System.out.println("Las temáticas a elegir son:");
            System.out.println("Historia - Actualidad");
            do{
                tematica = teclado.next();
                tematica = tematica.toLowerCase();
                if(tematica.equals("historia") == false && tematica.equals("actualidad") == false){
                    System.out.println("Por favor, escoja una de las opciones");
                }
            }while(tematica.equals("historia") == false && tematica.equals("actualidad") == false);

            while (preguntaDAO.listar().size() > cont){


                    System.out.println("Pregunta número " + cont);
                    if(preguntaDAO.listar().get(cont).getTematica().equals(tematica)){
                        System.out.println(preguntaDAO.listar().get(cont).getTexto());
                        System.out.println("1) " + preguntaDAO.listar().get(cont).getOpcion().get(0).getTexto());
                        System.out.println("2) " + preguntaDAO.listar().get(cont).getOpcion().get(1).getTexto());
                        System.out.println("3) " + preguntaDAO.listar().get(cont).getOpcion().get(2).getTexto());

                        do{
                            System.out.println("Introduce tu respuesta");
                            respuestaPregunta = teclado.nextInt();
                        }while(respuestaPregunta != 1 && respuestaPregunta != 2 && respuestaPregunta != 3);

                        //resto una para que coincida con las posiciones del arraylist
                        respuestaPregunta--;
                        if(preguntaDAO.listar().get(cont).getOpcion().get(respuestaPregunta).isAcierto()){
                            System.out.println("Su respuesta es correcta");
                            Thread.sleep(2000);

                        }else{
                            System.out.println("Su respuesta es incorrecta, la respuesta correcta era: ");
                            for(int i=0; i<preguntaDAO.listar().get(cont).getOpcion().size(); i++){
                                if(preguntaDAO.listar().get(cont).getOpcion().get(i).isAcierto()){
                                    System.out.println(preguntaDAO.listar().get(cont).getOpcion().get(i).getTexto());
                                    Thread.sleep(2000);
                                }
                            }
                        }
                    }



                cont++;

            }
        }else if(elegirModo.equals(2)){ // modo multijugador

        }
    }
}