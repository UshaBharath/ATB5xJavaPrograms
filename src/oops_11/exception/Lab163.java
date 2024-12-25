package src.oops_11.exception;

public class Lab163 {
    public static void main(String[] args) {

        String sh = args[0]; //if no value then java.lang.ArrayIndexOutOfBoundException
        int x = Integer.parseInt(sh); // If not number, java.lang.NumberFormatException - String to Int
        int a = 10/x; //if x = 0, Airthmetic Exception

        System.out.println(x);
        System.out.println(a);
    }
}
