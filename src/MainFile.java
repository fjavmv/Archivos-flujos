import java.io.File;

public class MainFile {
    public static void main(String []args){
        final String NOMBRE_ARCHIVO = "miarchivo.txt";
        boolean ok;
        try{
            File miArchivo = new File(NOMBRE_ARCHIVO);
            if (miArchivo.exists()){
               ok = miArchivo.delete();
            }else{
               ok  = miArchivo.createNewFile();
                System.out.println("Archivo creado");
            }

        }catch (Exception ex){
            System.out.println("NO se pudo crear el archivo"+ ex.getMessage());
        }

    }
}
