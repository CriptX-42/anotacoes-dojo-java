package YColecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTeste01 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        lista.toArray(new Integer[0]);

        System.out.println(lista);

        System.out.println("==================");

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 42;
        numerosArray[1] = 24;
        numerosArray[2] = 1;
//
//        List<Integer> list = Arrays.asList(numerosArray);
//
//        list.set(0, 12);
//
//        System.out.println(Arrays.toString(numerosArray));
//        System.out.println(list);

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(numerosArray));


        System.out.println(integers);

    }
}
