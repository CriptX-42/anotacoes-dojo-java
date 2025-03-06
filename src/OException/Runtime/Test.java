package OException.Runtime;

public class Test {
    public static void main(String[] args) {
        System.out.println(divisao(1, 0));
    }

    private static int divisao(int a, int b) {
        if(b == 0){
            throw new IllegalArgumentException("Não pode fazer divisão por 0");
        }
        return a/b;
    }
}
