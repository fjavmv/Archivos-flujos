package scanner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FinalDeDocumento {
    public static void main(String[] args) {

        Scanner inputStream = null;
        PrintWriter outputStream = null;

        try {

            inputStream = new Scanner(new FileInputStream("miarchivo.txt"));
            outputStream = new PrintWriter(new FileOutputStream("dos.txt"));

        } catch (FileNotFoundException e) {
            System.out.println("Ocurrio un problema al abrir el archivo.");
            System.exit(0);
        }

        String linea;
        int contador = 0;

        while (inputStream.hasNextLine()) {
            linea = inputStream.nextLine();
            contador++;
            outputStream.println(contador + " " + linea);
        }
        inputStream.close();
        outputStream.close();
    }
}
