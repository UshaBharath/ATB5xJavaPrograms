package src.basics_06;

import java.util.Scanner;

public class Lab105 {
    public static void main(String[] args) {
        //Take input from user, marks of five subjects and print

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter First subject");
        marks[0] = sc.nextFloat();
        System.out.println("Enter second sub");
        marks[1] = sc.nextFloat();
        System.out.println("Enter third sub");
        marks[2] = sc.nextFloat();
        System.out.println("Enter fourth sub");
        marks[3] = sc.nextFloat();
        System.out.println("Enter fifth sub");
        marks[4] = sc.nextFloat();

        for(int i=0; i<marks.length; i++)
        {
            if(marks[i]<30)
            {
                System.out.println("you are fail in this subject" + marks[i]);
            }
            System.out.println(marks[i]);
        }

        sc.close();

    }
}
