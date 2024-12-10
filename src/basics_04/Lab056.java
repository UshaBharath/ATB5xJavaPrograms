package src.basics_04;

import java.util.Scanner;

public class Lab056 {
    public static void main(String[] args) {

        //Switch Condition
        //Program - which day is today?
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1-7, i will tell which day it is");

        int dayNumber = sc.nextInt();

        switch (dayNumber)
        {
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
            case 7:
                System.out.println("SUN");
                break;
            default:
                System.out.println("ARE YOU MAD?");
                break; // here break is optional, if default is last option
        }
        System.out.println("- End of the program - ");

    }
}
