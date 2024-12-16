package src.oops_07;

public class Lab118 {
    public static void main(String[] args) {

        String s = appDutta("Usha");
        System.out.println(s);
        print("Hello World");
    }

    static String appDutta(String s)
    {
        System.out.println("Return with Parameter");
        return s;
    }

    static void print1(String s)
    {
        System.out.println("Non Return with Parameter");
    }

    static void print(String s)
    {
        System.out.println(s);
    }

}
