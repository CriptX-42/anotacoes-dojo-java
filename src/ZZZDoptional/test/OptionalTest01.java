package ZZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> name = findName("Ricardo");
        String empty = name.orElse("Não encontrou um nome");

        name.ifPresent(s -> System.out.println(s.toUpperCase()));
    }
    private static Optional<String> findName(String name) {
        List<String> nameList = List.of("Ricardo", "Icaro");
        int i = nameList.indexOf(name);
        if( i != -1) {
            return Optional.of(nameList.get(i));
        }
        return  Optional.empty();
    }
}
