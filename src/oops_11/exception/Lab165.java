package src.oops_11.exception;

public class Lab165 {
    public static void main(String[] args) {
        try
        {
            String sh = args[0];
            int x = Integer.parseInt(sh);
            int a = 10/x;
            System.out.println(x);
            System.out.println(a);
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("I will be executed");
        }
    }
}
