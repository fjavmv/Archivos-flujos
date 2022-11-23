package files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OperacionesPrimitivos {
    private double sum; // Suma

    /**
     * Pasamos al constructor el nombre del archivo.
     * El archivo es abierto, leemos los números del archivo, y
     * la suma de estos es almacenada en la variable sum.
     */

    public OperacionesPrimitivos(String nombreArchivo) throws IOException {
        String str; // Almacena la línea leida del archivo

        //Se crea un objeto de tipo File para manipular archivos
        File file = new File(nombreArchivo);
        Scanner inputFile = new Scanner(file);

        // Inicializamos el acumulador.
        sum = 0.0;

        // Leemos todos los valores alojados en el archivo
        // Se calcula el total.
        while (inputFile.hasNext()) {
            // Leemos el valor alojado en el archivo.
            double numero = inputFile.nextDouble();

            // Sumamos numero a sum.
            sum = sum + numero;
        }

        // Cerramos archivo.
        inputFile.close();
    }

    /**
     * Retornamos la suma.
     */

    public double getSum() {
        return sum;
    }
}

