package src.basics_04;

import java.util.Scanner;

public class Lab051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student score65");
        int score = sc.nextInt();

        if(score >= 90 && score <= 100)
        {
            System.out.println("You score -> A");
        }
        else if(score >=80 && score <=89)
        {
            System.out.println("You score -> B");
        }
        else if(score >=70 && score <=79)
        {
            System.out.println("You score -> C");
        }
        else if(score >=60 && score <=69)
        {
            System.out.println("You score -> D");
        }
        else
        {
            System.out.println("You score -> F");
        }
    }
}
