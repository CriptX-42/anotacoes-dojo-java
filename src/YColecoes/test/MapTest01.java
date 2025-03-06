package YColecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("keyboard","teclado");
        map.put("mose","mouse");

        System.out.println(map);
        System.out.println();

        for (String key: map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        System.out.println();

        for (String values: map.values()) {
            System.out.println(values);

        }

    }
}
