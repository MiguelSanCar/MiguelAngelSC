import java.io.*;
import java.nio.charset.StandardCharsets;

public class ejercicioutf {
    public static void main(String[] args) throws IOException {
        FileInputStream entrada1 = null;
        FileOutputStream salida1 = null;

        InputStreamReader entrada2 = null;
        OutputStreamWriter salida2 = null;

        try {
            String path1 = "C:\\Users\\FP\\Desktop\\dsa\\fichero1.txt";
            String path2 = "C:\\Users\\FP\\Desktop\\dsa\\fichero2.txt";

            entrada1 = new FileInputStream(path1);
            salida1 = new FileOutputStream(path2);

            entrada2 = new InputStreamReader(entrada1, StandardCharsets.UTF_8);
            salida2 = new OutputStreamWriter(salida1, "ISO-8859-1");

            int cosa1 = 0;
            cosa1 = entrada2.read();
            while (cosa1 != -1) {
                System.out.println(cosa1);
                salida2.write(cosa1);
                cosa1 = entrada2.read();
            }


        } catch (Exception e) {

        } finally {
            try {
                if (entrada1 == null) entrada1.close();
                if (salida1 == null) salida1.close();
                if (entrada2 == null) entrada2.close();
                if (salida2 == null) salida2.close();

            } catch (Exception e) {
                
            }
        }

    }

}
