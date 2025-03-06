package ZZAclassesInternasTeste;

public class OuterClassesTest01 {
    private String name = "Monkey";

    class Inner {
        public void printerOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }
    public static void main(String[] args) {
        //Outer Class
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        inner.printerOuterClassAttribute();
    }
}
