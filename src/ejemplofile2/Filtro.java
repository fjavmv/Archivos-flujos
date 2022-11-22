package ejemplofile2;

import java.io.File;
import java.io.FilenameFilter;

public class Filtro implements FilenameFilter {
    String extension;
    public Filtro(String extension){
        this.extension=extension;
    }

    @Override
    public boolean accept(File dir, String name){
        return name.endsWith(extension);
    }
}
