package bufferedreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedUno {
    public static void main(String[] args) {
        try {
            BufferedReader inputStream = new BufferedReader(new FileReader("ejemplo.txt"));
            String linea = inputStream.readLine();
            System.out.println(
                    "La primera líneas leida es: ");
            System.out.println(linea);

            linea = inputStream.readLine();
            System.out.println(
                    "La segunda líneas es: ");
            System.out.println(linea);
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no fue encontrado");
            System.out.println("O no fue posible abrirlo.");
        } catch (IOException e) {
            System.out.println("Error de lectura ejemplo.txt.");
        }
    }
}
