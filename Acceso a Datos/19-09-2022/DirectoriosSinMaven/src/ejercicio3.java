import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ejercicio3 {
    public static void main(String[] args) throws IOException {
        FileInputStream entrada = new FileInputStream("C:\\Users\\FP\\Desktop\\dsa\\fichero1.txt");
        FileOutputStream salida = new FileOutputStream("C:\\Users\\FP\\Desktop\\dsa\\fichero2.txt");


        int cosa1 = 0;
        while (cosa1 != -1) {
            cosa1 = entrada.read();
            System.out.println(cosa1);
            salida.write(cosa1);
        }


    }

}
