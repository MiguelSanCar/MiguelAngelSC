import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws IOException {
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

        alumnos.add(new Alumno("a", 21, 10));
        alumnos.add(new Alumno("a", 21, 0));
        alumnos.add(new Alumno("a", 17, 4));
        alumnos.add(new Alumno("a", 19, 8));


        RandomAccessFile raf = null;

        try {
            raf = new RandomAccessFile("C:\\Users\\FP\\Desktop\\dsa\\fichero3.txt", "rw");

            for (Alumno alumno : alumnos) {
                raf.writeChars(alumno.getNombre());
                raf.writeInt(alumno.getEdad());
                raf.writeDouble(alumno.getNotaMedia());
            }

            raf.seek(14);

            String nombre = "";
            int edad = 0;
            Double nota = 0.0;

            nombre += raf.readChar();
            edad = raf.readInt();
            nota = raf.readDouble();

            System.out.println(nombre + " " + edad + " " + nota);
        } catch (Exception e) {

        } finally {
            raf.close();

        }

    }

}
