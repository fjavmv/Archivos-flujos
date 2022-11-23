package files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MainWriter
{
    public static void main(String[] args)
    {
        //PrintWriter outputFile = new PrintWriter("C:\Users\mende\Desktop\prueba\miprueba.txt");
        try{
            PrintWriter outputFile = new PrintWriter("C:\\Users\\mende\\Desktop\\prueba\\miprueba.txt");
            outputFile.println("Maria");
            outputFile.println(2);
            outputFile.println("Karen");
            outputFile.println(98);
            outputFile.println("EEEEEEEEEEE");
            outputFile.println(82);
            outputFile.close();
        }catch (FileNotFoundException ex)
        {
            System.out.println("Ha ocurrido un error" +  ex.getMessage());
        }
    }
}
