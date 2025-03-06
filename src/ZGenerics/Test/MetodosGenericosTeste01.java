package ZGenerics.Test;

import ZGenerics.Domonio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodosGenericosTeste01 {
    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("Canoa quebrada"));
    }
    private static <T> void criarArrayComUmObjeto(T t) {
        List<T> list = List.of(t);
        System.out.println(list);
    }
}
