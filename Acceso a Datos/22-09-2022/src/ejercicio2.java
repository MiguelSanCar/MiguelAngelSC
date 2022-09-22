import java.io.FileInputStream;
import java.io.IOException;

public class ejercicio2 {
    public static void main(String[] args) throws IOException {
        FileInputStream entrada = new FileInputStream("C:\\Users\\FP\\Desktop\\dsa\\fichero1.txt");

        do {
            System.out.print(entrada.read() + " ");
        } while (entrada.read() != -1);

    }

}
