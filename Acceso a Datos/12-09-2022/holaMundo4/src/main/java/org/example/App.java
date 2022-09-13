package org.example;
import java.io.*;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String matricula = "";
        Boolean correcto = false;
        ArrayList<Integer> numMatricula = new ArrayList<Integer>();
        ArrayList<Character> charMatricula = new ArrayList<Character>();

        do {

            System.out.println("Introduzca la matricula del vehiculo:");
            Scanner teclado = new Scanner(System.in);
            matricula = teclado.next();

            if(matricula.length() < 5 || matricula.length() > 5){
                System.out.println("Introduce una matricula valida, debe tener 5 digitos");
            }else if(Character.isDigit(matricula.charAt(matricula.length() - 1))){
                System.out.println("Introduce una matricula valida, debe tener una letra al final");
            }else{
                correcto = true;
            }
        }while (!correcto);
        for(int i=0; i<matricula.length(); i++){
            if(Character.isDigit(matricula.charAt(i))){
                int temp = Character.getNumericValue(matricula.charAt(i));
                numMatricula.add(temp);
            }else{
                charMatricula.add(matricula.charAt(i));
            }
        }

        for(int i=0; i<numMatricula.size(); i++){
            int num1 = numMatricula.get(i);
            int num2 = numMatricula.get(i+1);

            int suma = num1 + num2;

            if(suma % 2 == 0){
                correcto = true;
                i++;
                System.out.println("Su matricula es correcta, puede pasar");

            }else if(charMatricula.
            else{
                System.out.println("Su matricula es incorrecta, no puede pasar");
                break;
            }
        }



    }

}
