package src.basics_06;

public class Lab107 {
    public static void main(String[] args) {
        //Write a program that prints numbers from 1 to 100.
        //However, for multiples of 3, print "Fizz" instead of the number,
        //and for multiples of 5, print "Buzz." For numbers that are multiples
        // of both 3 and 5, print "FizzBuzz."

        //coding ->
        //1. user input ?
        //2. Rough Logic
        //3. Brute Force
        //4. Logic Correction

        for(int i = 1; i<=100; i++)
        {
            if(i%3 == 0 && i%5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if(i%3 == 0)
            {
                System.out.println("Fizz");
            }
            else if(i%5 == 0)
            {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
