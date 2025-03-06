package ZZAclassesInternasTeste;

class Animal {
    public void walk() {
        System.out.println("animal walking");
    }
}
public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            // Isso é uma subclasse de animal

            @Override
            public void walk() {
                System.out.println("Animal stoping");
            }
        };
        animal.walk();
    }
}
