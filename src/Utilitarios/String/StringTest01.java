package Utilitarios.String;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Ricardo";
        nome.concat("Carvarlho");
        System.out.println("Sem string builder: " + nome);
        StringBuilder sb = new StringBuilder("Ricardo");
        sb.append(" Carvalho").append(" Sobrenome");
        System.out.println("Sem string builder: " + sb);

        sb.reverse();
        sb.delete(0,3);

        System.out.println("Sem string builder: " + sb);

    }


}
