package scanner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NextInt {
    public static void main(String[] args) {
        Scanner inputStream = null;
        try {
            inputStream = new Scanner(new FileInputStream("dos.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("El archivo documento.txt no fue encontrado.");
            System.out.println("o no puede abrirse.");
            System.exit(0);
        }
        int next, sum = 0;
        while (inputStream.hasNextInt()) {
            next = inputStream.nextInt();
            sum = sum + next;
        }
        inputStream.close();
        System.out.println("La suma de los números es: " + sum);
    }
}
