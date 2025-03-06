package OException.Exception;

import java.io.File;
import java.io.IOException;

public class Exception01 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException {
    File file = new File("/home\\teste.txt");
         boolean criado = file.createNewFile();
         System.out.println("Arquivo criado " + criado);
    }
}
