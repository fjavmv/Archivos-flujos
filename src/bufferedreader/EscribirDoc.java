package bufferedreader;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.CREATE;

public class EscribirDoc {
    public static void main(String[] args) {
        Path file = Paths.get("C:\\Users\\mende\\Desktop\\prueba\\ejemplo.doc");
        String s = "ESTO ES UNA PRUEBAIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII";
        byte[] datos = s.getBytes();
        OutputStream output = null;
        try {
            output = new BufferedOutputStream(Files.newOutputStream(file,CREATE));
            output.write(datos);
            output.flush();
            output.close();
        } catch (Exception e) {
            System.out.println("Mensaje: " + e);
        }
    }
}
