package ZGenerics.Test;

import YColecoes.Domain.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList();
        lista.add("teste");

        for (String object : lista) {
            System.out.println(object);
        }
    }
}
