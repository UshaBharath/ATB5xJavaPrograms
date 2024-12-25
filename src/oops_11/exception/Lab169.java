package src.oops_11.exception;

public class Lab169 {
    public static void main(String[] args) {
        extracted2();
        System.out.println("MAIN execute");
    }

    private static void extracted2() {
        extracted1();
        System.out.println("Extracted2 execute");
    }

    private static void extracted1() {
        extracted();
        System.out.println("Extracted1 execute");
    }

    private static void extracted() {
        try
        {
            String name = null;
            name.length();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();//This will print the error in Red color
        }

    }
}