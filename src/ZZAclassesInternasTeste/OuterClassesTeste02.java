package ZZAclassesInternasTeste;

public class OuterClassesTeste02 {
    private String nome = "Nissan";
    void  print() {
        class LocalClass {
            public void printLocal() {
                System.out.println(nome);
            }
        }
        LocalClass localClass = new LocalClass();// cria um atributo
        localClass.printLocal();
    }
    public static void main(String[] args) {
        OuterClassesTeste02 outer = new OuterClassesTeste02();
        outer.print();
    }
}
