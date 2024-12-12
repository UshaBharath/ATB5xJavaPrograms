package src.basics_05;

import java.util.Scanner;

public class Lab095 {
    public static void main(String[] args) {
        //sum of digit - Ex., 5 = 5+4+3+2+1 = 15

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        long sum = 0;

        for(int i=1; i<=num; i++)
        {
            sum = sum+i;
        }
        System.out.println("Sum is " + sum);


        sc.close();


    }
}
