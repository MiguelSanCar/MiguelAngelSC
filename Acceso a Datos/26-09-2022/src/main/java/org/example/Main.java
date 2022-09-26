package org.example;

import org.example.Persona;

import java.io.*;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Persona> personas = new ArrayList<Persona>();

        personas.add(new Persona("a", "b", "01/02/2018"));
        personas.add(new Persona("c", "d", "05/06/2001"));
        personas.add(new Persona("e", "f", "18/12/1954"));
        personas.add(new Persona("g", "h", "11/11/2011"));


        FileInputStream fis = null;
        FileOutputStream fos = null;

        InputStreamReader isr = null;

        ObjectInputStream ois = null;
        ObjectOutputStream ous = null;

        try{

            fos = new FileOutputStream("C:\\Users\\FP\\Desktop\\Datos.txt");
            ous = new ObjectOutputStream(fos);

            for (Persona persona : personas){
                ous.writeObject(persona);
            }
        }catch(Exception e){

        }finally{
            ous.close();
        }

        boolean continuar = true;
        ArrayList<Persona> personas2 = new ArrayList<Persona>();

        try{


            fis = new FileInputStream("C:\\Users\\FP\\Desktop\\Datos.txt");
            ois = new ObjectInputStream(fis);

            continuar = true;
            while(continuar){
                try{
                    personas2.add((Persona) ois.readObject());
                }catch (EOFException e){
                    continuar = false;
                }
            }

        }catch(Exception e){
            e.printStackTrace();

        }finally{
            try{
                if(fis != null){
                    fis.close();
                }
                if(ois != null){
                    ois.close();
                }

            }catch(Exception e){
                e.printStackTrace();
            }
        }

        for(Persona persona2 : personas2){
            System.out.println(persona2.toString());
        }

    }
}

