package src.basics_03;

import java.util.Scanner;

public class Lab048 {
    public static void main(String[] args) {
       //Find the max out of two number.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b)
        {
            System.out.println("Max > " +a);
        }
        else
        {
            System.out.println("Max > "+b);
        }
    }
}

