package OException;

import java.io.*;
import java.sql.SQLException;

public class Teste02 {
    public static void main(String[] args) {

    }

    public static void LerArquivo2() throws IOException {
        try (Reader reader  = new BufferedReader(new FileReader("teste.txt"))) {

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
