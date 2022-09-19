import java.io.FileInputStream;
import java.io.IOException;

public class ejercicio4 {
    public static void main(String[] args) throws IOException {
        FileInputStream entrada = new FileInputStream("C:\\Users\\FP\\Desktop\\dsa\\fichero1.txt");


        int cosa1 = 0;
        int suma = 0;
        int cont = 0;
        while (cosa1 != -1) {
            System.out.println(cosa1);
            cosa1 = entrada.read();
            suma = suma + cosa1;
            cont++;
            if (cosa1 == |) {
                
            }

        }
        double total = suma / cont;
        System.out.println(total);


    }

}
