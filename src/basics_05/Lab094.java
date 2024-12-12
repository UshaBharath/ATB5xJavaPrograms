package src.basics_05;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
        //Factorial

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        long fact = 1;

//        int i = 1;
//        while(i<=num)
//        {
//            fact = fact * i;
//            i++;
//        }
//        System.out.println("Fact -> " + fact);

        for(int j = 1; j<=num; j++)
        {
            fact = fact * j;
        }
        System.out.println("Fact -> " + fact);


        sc.close();


    }
}
