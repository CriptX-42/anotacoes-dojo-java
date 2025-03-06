package YColecoes.test;

import YColecoes.Domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneTestList01 {
    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("123", "Samsung");
        Smartphone s2 = new Smartphone("123456", "Samsung");
        Smartphone s3 = new Smartphone("789654", "Samsung");

        List<Smartphone> smartphones = new ArrayList(6);
        smartphones.add(s1);
        smartphones.add(s3);
        smartphones.add(s3);

        for (Smartphone smartphone: smartphones) {
            System.out.println(smartphone.toString());
        };

        // saber se algo está na lista
        Smartphone s4 = new Smartphone("789654", "Samsung");

        // Aqui o Equals vai ser executado
        System.out.println(smartphones.contains(s4));

        int indexSmartphone = smartphones.indexOf(s4);

        System.out.println(indexSmartphone + " index");

        System.out.println(smartphones.get(indexSmartphone) + " Pegando pelo index");

    }
}
