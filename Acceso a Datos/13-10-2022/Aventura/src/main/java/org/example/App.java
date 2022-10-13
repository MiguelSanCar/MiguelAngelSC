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
    public static boolean vendas = false;

    public static void main( String[] args ) throws JAXBException, InterruptedException {
        Scanner teclado = new Scanner(System.in);

        Aventura escena = realizarlLecturaXML("C:\\Users\\FP\\IdeaProjects\\Aventura\\src\\main\\java\\org\\example\\Escenas.xml");

        int numEscena = 0;
        boolean finpartida = false;


        System.out.println( "                                                                                                                                                              " );
        System.out.println("                                                                                                                                                              ");
        System.out.println("               AAA                                                                         tttt                                                               ");
        System.out.println("              A:::A                                                                     ttt:::t                                                               ");
        System.out.println("             A:::::A                                                                    t:::::t                                                               ");
        System.out.println("            A:::::::A                                                                   t:::::t                                                               ");
        System.out.println("           A:::::::::Avvvvvvv           vvvvvvv eeeeeeeeeeee    nnnn  nnnnnnnn    ttttttt:::::ttttttt    uuuuuu    uuuuuu rrrrr   rrrrrrrrr   aaaaaaaaaaaaa   ");
        System.out.println("          A:::::A:::::Av:::::v         v:::::vee::::::::::::ee  n:::nn::::::::nn  t:::::::::::::::::t    u::::u    u::::u r::::rrr:::::::::r  a::::::::::::a  ");
        System.out.println("         A:::::A A:::::Av:::::v       v:::::ve::::::eeeee:::::een::::::::::::::nn t:::::::::::::::::t    u::::u    u::::u r:::::::::::::::::r aaaaaaaaa:::::a ");
        System.out.println("        A:::::A   A:::::Av:::::v     v:::::ve::::::e     e:::::enn:::::::::::::::ntttttt:::::::tttttt    u::::u    u::::u rr::::::rrrrr::::::r         a::::a ");
        System.out.println("       A:::::A     A:::::Av:::::v   v:::::v e:::::::eeeee::::::e  n:::::nnnn:::::n      t:::::t          u::::u    u::::u  r:::::r     r:::::r  aaaaaaa:::::a ");
        System.out.println("      A:::::AAAAAAAAA:::::Av:::::v v:::::v  e:::::::::::::::::e   n::::n    n::::n      t:::::t          u::::u    u::::u  r:::::r     rrrrrrraa::::::::::::a ");
        System.out.println("     A:::::::::::::::::::::Av:::::v:::::v   e::::::eeeeeeeeeee    n::::n    n::::n      t:::::t          u::::u    u::::u  r:::::r           a::::aaaa::::::a ");
        System.out.println("    A:::::AAAAAAAAAAAAA:::::Av:::::::::v    e:::::::e             n::::n    n::::n      t:::::t    ttttttu:::::uuuu:::::u  r:::::r          a::::a    a:::::a ");
        System.out.println("   A:::::A             A:::::Av:::::::v     e::::::::e            n::::n    n::::n      t::::::tttt:::::tu:::::::::::::::uur:::::r          a::::a    a:::::a ");
        System.out.println("  A:::::A               A:::::Av:::::v       e::::::::eeeeeeee    n::::n    n::::n      tt::::::::::::::t u:::::::::::::::ur:::::r          a:::::aaaa::::::a ");
        System.out.println(" A:::::A                 A:::::Av:::v         ee:::::::::::::e    n::::n    n::::n        tt:::::::::::tt  uu::::::::uu:::ur:::::r           a::::::::::aa:::a");
        System.out.println("AAAAAAA                   AAAAAAAvvv            eeeeeeeeeeeeee    nnnnnn    nnnnnn          ttttttttttt      uuuuuuuu  uuuurrrrrrr            aaaaaaaaaa  aaaa");
        System.out.println("                                                                                                                                                              ");
        System.out.println("                                                                                                                                                              ");

        while(!finpartida){
            int eleccion = 0;

            for(Escena escenaActual: escena.getEscenas()){
                if(escenaActual.getCodigo() == numEscena){
                    System.out.println(escenaActual.texto);
                    for(Opcion opcion1:escenaActual.getOpcion()){
                        if(opcion1.getId() != 9) {
                            System.out.println(opcion1.getId() + "- " + opcion1.getTexto());
                        }else{
                            finpartida = true;
                        }
                    }

                }
            }
            do{
                eleccion = teclado.nextInt();
                if(eleccion <0 || eleccion >4){
                    System.out.println("Su elección debe estar dentro de los números indicados, por favor, introduzca un número dentro de los aceptados");
                }

            }while (eleccion >3 || eleccion <0);
            vendas = romperChaqueta(escena, numEscena, eleccion);
            ponervendas(escena, numEscena, eleccion);
            numEscena = realizarEleccion(numEscena, escena, eleccion);

        }



    }

    private static boolean ponervendas(Aventura escena, int numEscena, int eleccion) throws InterruptedException {
        if(escena.getEscenas().get(numEscena).getCodigo() == 7 && eleccion == 1 && vendas == true){
            System.out.println("Te curas las heridas con las vendas caseras");
            vendas = false;
            return false;
        }else if(escena.getEscenas().get(numEscena).getCodigo() == 7 && eleccion == 1 && vendas == false){
            System.out.println("                    Miras tus bolsillos y la mochila, pero no tienes vendas");
            Thread.sleep(2000);
            return false;
        }
        return false;
        }
    private static boolean romperChaqueta(Aventura escena, int numEscena, int eleccion){
        if(escena.getEscenas().get(numEscena).getCodigo() == 2 && eleccion == 2){
            return true;
        }
        else{
            return false;
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
