package src.oops_07;

import java.util.Scanner;

public class Lab121 {

    public static void main(String[] args) {
        //swap the 2 numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();

//        int temp = a;
//        a = b;
//        b = temp;

        //without using temp variable

        a = a+b;
        b = a-b;
        a = a-b;

        //without using temp variable,
        //if one of the variable is zero, then it won't work

//        a = a * b;
//        b = a / b;
//        a = a / b;

        //without using temp variable,
        //using XOR gate, not recommended

//        a = a^b;
//        b = a^b;
//        a = a^b;


        System.out.println("Value of a and b " + a + " " + b);
    }
}
