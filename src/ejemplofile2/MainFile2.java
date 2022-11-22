package ejemplofile2;

import java.io.File;
import java.util.Objects;

public class MainFile2 {
    public static void main(String []args){
        File archivo=new File("miarchivo.txt");
        if(archivo.exists()){
            System.out.println("Nombre del archivo "+archivo.getName());
            System.out.println("Ruta             "+archivo.getPath());
            System.out.println("Ruta absoluta    "+archivo.getAbsolutePath());
            System.out.println("Se puede escribir  "+archivo.canRead());
            System.out.println("Se puede leer      "+archivo.canWrite());
            System.out.println("Tamaño             "+archivo.length());
//para calcular el tamaño del archivo en KB se divide entre 1024
            System.out.println(" ******* lista de los archivos de este directorio *******");
            archivo=new File(".");
            String[] listaArchivos=archivo.list();
            for(int i = 0; i< Objects.requireNonNull(listaArchivos).length; i++){
                System.out.println(listaArchivos[i]);
            }
            System.out.println(" ******* lista de los archivos con filtro *******");
            listaArchivos=archivo.list(new Filtro(".txt"));
            for(int i = 0; i< Objects.requireNonNull(listaArchivos).length; i++){
                System.out.println(listaArchivos[i]);
            }

        }
        try{
            //espera la pulsación de una tecla y luego RETORNO
           int val = System.in.read();
        }catch (Exception ex){
            System.out.println("Ocurrio un error....:("+ ex.getMessage());
        }

    }
}
