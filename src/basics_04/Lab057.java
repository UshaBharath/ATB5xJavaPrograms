package src.basics_04;

import java.util.Scanner;

public class Lab057 {
    public static void main(String[] args) {

        //Switch Condition
        //Real time Usecase
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser name Chrome, Firefox, edge, Opera");
        //String browser = sc.next();
        String browser = sc.nextLine();

        switch (browser.toLowerCase())
        {
            case "chrome":
                System.out.println("Execute the chrome code");
                break;
            case "firefox":
                System.out.println("Execute the Firefox code");
                break;
            case "edge":
                System.out.println("WED");
                break;
            default:
                System.out.println("I have no idea which browser it is");
        }
        System.out.println("- End of the program - ");

    }
}
