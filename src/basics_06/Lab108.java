package src.basics_06;

public class Lab108 {
    public static void main(String[] args) {

        //Create a program that determines whether a given
        // year is a leap year. A leap year is divisible by 4,
        // but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.

        //coding ->
        //1. user input ?
        //2. Rough Logic ->  (year%4 ==0) -> and (year%100 != 0) -> leap
        //                   or (year%400 == 0) -> leap
        //3. Brute Force
        //4. Logic Correction

        int year = 1500;

        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a Leap year");
        }



    }
}
