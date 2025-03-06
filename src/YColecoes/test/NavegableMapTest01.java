package YColecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavegableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("C", "Letra C");
        map.put("B", "Letra B");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()  + " " + entry.getValue());
        }

    }
}
