package files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DosWriter {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);

        //Solicitamos el nombre del archivo.
        System.out.print("Introduce el nombre de tu archivo: ");
        String nombreArchivo = entrada.nextLine();

        // Abrimos el archivo.
       File file = new File(nombreArchivo);
       Scanner inputFile = new Scanner(file);

      // Leemos la primera linea del archivo.
      String linea = inputFile.nextLine();

     // Mostramos en pantalla la información.
      System.out.println("La primera linea es: ");
      System.out.println(linea);// Cerramos el archivo.
      inputFile.close();
    }
}
