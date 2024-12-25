package src.oops_10.polymorphism.methodoverriding;

public class RC {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.bark();

        Hund h = new Hund();
        h.bark();

        Dog f = new Hund();
        f.bark();

       // Hund g = new Dog(); //Not possible till Java 22, latest is Java 22
        //g.bark();
    }
}
