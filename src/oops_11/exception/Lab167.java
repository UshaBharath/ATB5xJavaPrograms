package src.oops_11.exception;

public class Lab167 {

    public static void main(String[] args) {
        try {

            int a = 0;
            int b = 10/a;
        }
        catch (Exception e)
        {
            System.out.println("Exit");
            //If System.exit is used then finally block wont execute
            System.exit(0);
        }
        finally {
            System.out.println("i will execute");
        }
    }
}
