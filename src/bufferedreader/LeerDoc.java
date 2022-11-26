package bufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeerDoc {

    public static void main(String[] args) {

        Path file = Paths.get("C:\\Users\\mende\\Desktop\\prueba\\ejemplo.doc");
        InputStream input;

        try {
            input = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String s;
            s = reader.readLine();
            System.out.println(s);
            input.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
