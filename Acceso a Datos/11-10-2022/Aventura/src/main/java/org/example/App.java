package org.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JAXBException {

        ArrayList<Escena> escenas = realizarlLecturaXML("C:\\Users\\FP\\IdeaProjects\\Aventura\\src\\main\\java\\org\\example\\Escenas.xml");;


        System.out.println( "                                                                                                                                                              \n" );
        System.out.println("                                                                                                                                                              \n");
        System.out.println("               AAA                                                                         tttt                                                               \n");
        System.out.println("              A:::A                                                                     ttt:::t                                                               \n");
        System.out.println("             A:::::A                                                                    t:::::t                                                               \n");
        System.out.println("            A:::::::A                                                                   t:::::t                                                               \n");
        System.out.println("           A:::::::::Avvvvvvv           vvvvvvv eeeeeeeeeeee    nnnn  nnnnnnnn    ttttttt:::::ttttttt    uuuuuu    uuuuuu rrrrr   rrrrrrrrr   aaaaaaaaaaaaa   \n");
        System.out.println("          A:::::A:::::Av:::::v         v:::::vee::::::::::::ee  n:::nn::::::::nn  t:::::::::::::::::t    u::::u    u::::u r::::rrr:::::::::r  a::::::::::::a  \n");
        System.out.println("         A:::::A A:::::Av:::::v       v:::::ve::::::eeeee:::::een::::::::::::::nn t:::::::::::::::::t    u::::u    u::::u r:::::::::::::::::r aaaaaaaaa:::::a \n");
        System.out.println("        A:::::A   A:::::Av:::::v     v:::::ve::::::e     e:::::enn:::::::::::::::ntttttt:::::::tttttt    u::::u    u::::u rr::::::rrrrr::::::r         a::::a \n");
        System.out.println("       A:::::A     A:::::Av:::::v   v:::::v e:::::::eeeee::::::e  n:::::nnnn:::::n      t:::::t          u::::u    u::::u  r:::::r     r:::::r  aaaaaaa:::::a \n");
        System.out.println("      A:::::AAAAAAAAA:::::Av:::::v v:::::v  e:::::::::::::::::e   n::::n    n::::n      t:::::t          u::::u    u::::u  r:::::r     rrrrrrraa::::::::::::a \n");
        System.out.println("     A:::::::::::::::::::::Av:::::v:::::v   e::::::eeeeeeeeeee    n::::n    n::::n      t:::::t          u::::u    u::::u  r:::::r           a::::aaaa::::::a \n");
        System.out.println("    A:::::AAAAAAAAAAAAA:::::Av:::::::::v    e:::::::e             n::::n    n::::n      t:::::t    ttttttu:::::uuuu:::::u  r:::::r          a::::a    a:::::a \n");
        System.out.println("   A:::::A             A:::::Av:::::::v     e::::::::e            n::::n    n::::n      t::::::tttt:::::tu:::::::::::::::uur:::::r          a::::a    a:::::a \n");
        System.out.println("  A:::::A               A:::::Av:::::v       e::::::::eeeeeeee    n::::n    n::::n      tt::::::::::::::t u:::::::::::::::ur:::::r          a:::::aaaa::::::a \n");
        System.out.println(" A:::::A                 A:::::Av:::v         ee:::::::::::::e    n::::n    n::::n        tt:::::::::::tt  uu::::::::uu:::ur:::::r           a::::::::::aa:::a\n");
        System.out.println("AAAAAAA                   AAAAAAAvvv            eeeeeeeeeeeeee    nnnnnn    nnnnnn          ttttttttttt      uuuuuuuu  uuuurrrrrrr            aaaaaaaaaa  aaaa\n");
        System.out.println("                                                                                                                                                              \n");
        System.out.println("                                                                                                                                                              \n");
        System.out.println("                                                                                                                                                              \n");
        System.out.println("                                                                                                                                                              \n");
        System.out.println("                                                                                                                                                              \n");





    }
    private static ArrayList<Escena> realizarlLecturaXML(String ruta) throws JAXBException {

        File file = new File(ruta);
        ArrayList<Escena> escenas = new ArrayList<Escena>();
        if (file.exists()) {
            JAXBContext jaxbContext = JAXBContext.newInstance(Aventura.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Aventura listaEscenas = (Aventura) jaxbUnmarshaller.unmarshal(file);
            System.out.println(listaEscenas);

        } else {
            System.out.println("No se ha podido encontrar el fichero indicado");
        }

        return escenas;
    }
}
