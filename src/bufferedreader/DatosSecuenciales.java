package bufferedreader;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class DatosSecuenciales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Path file = Paths.get("C:\\Users\\mende\\Desktop\\prueba\\empleados.doc");
        String s;
        String separador = ",";
        int id;
        String nombre;
        double salario;
        final int SALIR = 0;

        try {

            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            System.out.print("Ingresa el número de empleado (ID) ==>> ");
            id = input.nextInt();

            while(id != SALIR)
            {
                System.out.print("Ingresa el nombre del empleado ==>> " +
                        id + " ==>> ");
                input.nextLine();
                nombre = input.nextLine();
                System.out.print("Salario del empleado ==>> ");
                salario = input.nextDouble();
                s = id + separador + nombre  + separador + salario;
                writer.write(s, 0, s.length());
                writer.newLine();
                System.out.print("Ingresa el número de empleado (ID) ==>> " +
                        SALIR + " 0 PARA SALIR ==>> ");
                id = input.nextInt();
            }
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("Ha ocurrido una excepción disculpa: " + e);
        }
    }
}
