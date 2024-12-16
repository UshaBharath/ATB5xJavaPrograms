package src.oops_07;

public class Lab112 {

    public static void main(String[] args) {
        int c = sum(3, 5); //  2 arguments
        int c1 = sum(); //no arguments
        int c2 = sum(2); //1 arguments
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);

        syaHello(); // call to the function
    }


    static int sum(int a, int b) //Definition of the function
    {
        return a + b;
    }

    static int sum(int a) {
        return a;
    }

    static int sum()
    {
        return 99;
    }

    static int sum(int a, int b, int c)
    {
       return(a + b + c);
    }

    static void syaHello()
    {
        System.out.println("Say Yes");
    }


}
