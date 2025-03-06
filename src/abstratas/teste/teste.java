package abstratas.teste;

import abstratas.dominio.Gerente;

public class teste {
    public static void main (String[] args) {
        Gerente gerente = new Gerente("Ricardo", 2000);

        System.out.println(gerente.toString());

    }
}
