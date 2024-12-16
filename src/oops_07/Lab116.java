package src.oops_07;

import java.util.Scanner;

public class Lab116 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        System.out.println(sc.next());
    }

    //It is called as Method Overloading
    public static void main(int a) {
        System.out.println("Another main");
    }

    public static int main(int a, int b)
    {
        return 99;
    }

    public static void main(int a, int b, int c)
    {
        System.out.println("Another main");
    }
}
