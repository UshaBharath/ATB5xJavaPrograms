package src.basics_04;

import java.util.Scanner;

public class Lab052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student score65");
        int score = sc.nextInt();
        //This is not a recommended way
        if(score >= 90 && score <= 100)
        {
            System.out.println("You score -> A");
        }
        if(score >=80 && score <=89)
        {
            System.out.println("You score -> B");
        }
        if(score >=70 && score <=79)
        {
            System.out.println("You score -> C");
        }
        if(score >=60 && score <=69)
        {
            System.out.println("You score -> D");
        }
        if(score >=0 && score <=59)
        {
            System.out.println("You score -> F");
        }
    }
}
