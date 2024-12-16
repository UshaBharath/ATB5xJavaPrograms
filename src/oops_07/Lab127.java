package src.oops_07;

import java.util.Scanner;

public class Lab127 {
    public static void main(String[] args) {

        //Prime number -> which is divisible by 1 and itself.
        //2 is the even prime number, other numbers are odd prime number

        int i = 0;
        int flag = 0;
        int m = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();

        m = n/2;
        if(n == 0 || n == 1)
        {
            System.out.println("Not a Prime number" + n);
        }
        else {
            for(i = 2; i <= m; i++)
            {
                if(n%i == 0)
                {
                    System.out.println("Its not a prime");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.println("Its a Prime");
            }
        }
    }
}
