package escribir;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class MainEscribir {
    public static void main(String[] args) {

        final String NOMBRE_DOCUMENTO = "miDocumento.txt";
        final int EXCEPTION_CODE_STATUS = 0;

        PrintWriter outputStream = null;

        try{
            outputStream = new PrintWriter(new FileOutputStream(NOMBRE_DOCUMENTO));
        }catch (FileNotFoundException ex){
            System.out.println("Error al abrir el documento:  " + NOMBRE_DOCUMENTO);
            System.exit(EXCEPTION_CODE_STATUS);
        }

        System.out.println("Escribiendo en archivo.......");
        outputStream.println("Est00000000000000000889999000......");
        outputStream.println("o es otro ejemplo8888888888888888..........");
        outputStream.print("nnnnnnnnnnnnnnnnnn");


        outputStream.close();

        System.out.println("Programa finalizado................");
    }
    //Ejercicios crear un programa que solicite mediante pantalla un texto y que se escriba en un documento con PrintWrite
    //Utilizar java SWING
}
