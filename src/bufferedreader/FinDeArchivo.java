package bufferedreader;
import java.io.*;

public class FinDeArchivo {

    public static void main(String[] args) {

        try {

            BufferedReader inputStream = new BufferedReader(new FileReader("uno.txt"));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("dos.txt"));

            int countador = 0;
            String linea = inputStream.readLine();

            while (linea != null) {
                countador++;
                outputStream.println(countador + " " + linea);
                linea = inputStream.readLine();
            }
            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Problema al abrir el archivo.");
        } catch (IOException e) {
            System.out.println("Error de lectura del documentos uno.txt.");
        }
    }
}
