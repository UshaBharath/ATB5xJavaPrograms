package src.oops_07;

import java.util.Scanner;

public class Lab124 {
    public static void main(String[] args) {
        //Print the array using user input

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] int_array = new int[n];

        System.out.println("Enter the elements");
        for(int i=0; i<n; i++)
        {
            int_array[i] = sc.nextInt();
        }

        System.out.println("-- output -- ");

        for(int i = 0; i<n ;i++)
        {
            System.out.println(int_array[i]);
        }
    }
}
