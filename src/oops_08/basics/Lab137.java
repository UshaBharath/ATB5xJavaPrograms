package src.oops_08.basics;

import java.util.Scanner;

public class Lab137 {
    public static void main(String[] args) {
        //Program to check string is Palindrome or not

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String user_input = sc.next();

        boolean result = isPalindrome(user_input);
        if(result)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }

    public static boolean isPalindrome(String userInput) {

        String original_input = userInput;
        StringBuilder sb = new StringBuilder(userInput);
        String rev_string = sb.reverse().toString();
        return original_input.equalsIgnoreCase(rev_string);
    }
}
