package src.oops_11;

public class Lab150 {

    public static void main(String[] args) {

        //without creating object, can access static variables
        System.out.println(StaticDemo.college_name);

        StaticDemo s1 = new StaticDemo();
        s1.version = 199;
        s1.printVersion();

        StaticDemo s2 = new StaticDemo();
        s2.version = 299;
        s2.printVersion();
    }
}
