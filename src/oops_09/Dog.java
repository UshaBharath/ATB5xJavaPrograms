package src.oops_09;

public class Dog {
    String name; //Instance Variable

    Dog()
    {
        System.out.println("DC");
    }

    Dog(String nameRef)
    {
        this.name = nameRef;
        System.out.println("PC");
    }

    void bark()
    {
        System.out.println("Bark");
        System.out.println("Dog name is " + this.name);
    }
}
