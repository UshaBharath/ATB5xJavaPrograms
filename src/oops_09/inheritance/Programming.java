package src.oops_09.inheritance;

public class Programming {

    int version;
    String author;

    Programming()
    {
        System.out.println("Program DC");
    }

    Programming(String author, int version)
    {
        this.version = version;
        this.author = author;
        System.out.println("PC");
    }

    void printInfo()
    {
        System.out.println("Program Info "+ this.version);
        System.out.println("Program Info "+ this.author);
    }

}
