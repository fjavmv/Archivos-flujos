package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainRead {
    public static void main(String[] args) throws FileNotFoundException {
        // Cremos un objeto para entrada por teclado.
        Scanner entrada = new Scanner(System.in);
        // Introducimos el nombre del archivo.
        System.out.println("Ingresa el nombre del archivo: ");
        String nombreArchivo = entrada.nextLine();
        //Abrimos archivo.
        File file = new File(nombreArchivo);
        Scanner inputFile = new Scanner(file);
        // Leemos las lineas del archivo hasta que exista más que leer.
        while (inputFile.hasNext()) {
            // Leemos el siguiente dato.
            String nombres = inputFile.nextLine();
            // Mostramos el nombre leido.
            System.out.println(nombres);
        }
        // Cerramos archivo.
        inputFile.close();
    }
}
