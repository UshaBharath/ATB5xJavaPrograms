package src.oops_10;

public class BlockClass {

    BlockClass()
    {
        System.out.println("DC");
    }

    { // Instance Initialization Block -> this block will execute first
        System.out.println("I am IIB");
    }

    static //If Static block is present then this will execute first
    {
        System.out.println("I am SIB");
    }



}
