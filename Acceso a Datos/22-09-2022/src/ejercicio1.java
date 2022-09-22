import java.io.File;
import java.io.IOException;

public class ejercicio1 {
    public static void main(String[] args) throws IOException {
        File directorio1 = new File("C:\\Users\\FP\\Desktop\\dsa\\Directorio1");
        File directorio2 = new File("C:\\Users\\FP\\Desktop\\dsa\\Directorio2");

        directorio1.mkdir();
        directorio2.mkdir();

        File fichero1 = new File("C:\\Users\\FP\\Desktop\\dsa\\Directorio1\\fichero1");
        File fichero2 = new File("C:\\Users\\FP\\Desktop\\dsa\\Directorio1\\fichero2");
        File fichero11 = new File("C:\\Users\\FP\\Desktop\\dsa\\Directorio1\\fichero1");
        File fichero111 = new File("C:\\Users\\FP\\Desktop\\dsa\\fichero1");

        fichero1.createNewFile();
        fichero2.createNewFile();
        fichero11.createNewFile();
        fichero111.createNewFile();


    }


}
