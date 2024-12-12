package src.basics_05;

import java.util.Scanner;

public class Lab068 {
    public static void main(String[] args) {
        //problem - 3/x^2 + y^2 - |z|  -> 3/ is cuberoot, |z| is absolute value means, if -1 then 1.

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the x");
        double x = sc.nextDouble();
        System.out.println("Enter the y");
        double y = sc.nextDouble();
        System.out.println("Enter the z");
        double z = sc.nextDouble();

        double result;

        //3/x^2 + y^2 - |z|
        // A + B -C -> A -> x^2, B -> y^2, C -> |z|
        result = Math.cbrt((Math.pow(x,2) + Math.pow(y,2) - Math.abs(z)));
        System.out.println(result);

        sc.close();

    }
}
