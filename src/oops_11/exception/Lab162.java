package src.oops_11.exception;

public class Lab162 {

    public static void main(String[] args) {
        //Exception - event that occurs during the execution of a program
        //that disrupt the normal flow of instructions.
        //

        try
        {
            String name = null;
            name.trim();
            System.out.println("I am Usha");
        } catch (Exception e) {
            System.out.println("you are trying to trim a null string this is not possible in java");;
        }
        System.out.println("Hi i am end of program");

    }
}
