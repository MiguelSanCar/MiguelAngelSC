package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner teclado = new Scanner(System.in);

        int numeroMB = 0;

        System.out.println("Introduce el número de dorsal de Mbappe");
        numeroMB = teclado.nextInt();


            System.out.println("El numero de amigos de Mbappe es: " + contador(numeroMB));



        }
    private static int contador(int numeroMB){
        int cont = 0;
        for(int x=10; x<1000; x++){
            String dorsalString = String.valueOf(x);
            if(Character.getNumericValue(dorsalString.charAt(0)) * Character.getNumericValue(dorsalString.charAt(1)) == numeroMB){
                if(Character.getNumericValue(dorsalString.charAt(0)) != 1 && Character.getNumericValue(dorsalString.charAt(1)) != 1){
                    cont++;
                }

            }
        }
        return cont;
    }
}
