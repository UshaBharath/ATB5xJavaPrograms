package src.basics_05;

import java.util.Scanner;

public class Lab069 {
    public static void main(String[] args) {

        //Take user input and print the information
        Scanner user_input= new Scanner(System.in);
        System.out.println("Enter your name");
        String name = user_input.next();

        System.out.println("Enter your age");
        int age = user_input.nextInt();

        System.out.println("Enter your Salary");
        double salary = user_input.nextDouble();

        System.out.println("Your details are " + name + " - " + age + " - " + salary);

    }
}
