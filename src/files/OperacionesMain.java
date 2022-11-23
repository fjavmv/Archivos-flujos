package files;

import java.io.IOException;

public class OperacionesMain {
    public static void main(String[] args) throws IOException {
        OperacionesPrimitivos op = new OperacionesPrimitivos("miarchivo.txt");
        System.out.println("La suma es: "+ op.getSum());
    }
}
