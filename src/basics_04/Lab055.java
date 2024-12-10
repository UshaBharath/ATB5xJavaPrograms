package src.basics_04;

import java.util.Scanner;

public class Lab055 {
    public static void main(String[] args) {

        //Find the Triangles

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all 3 sides of the triangle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if((side1 == side2) && (side2 == side3) && (side1 == side3))
        {
            System.out.println("Equilateral Triangle");
        }
        else if((side1 == side2) || (side2 == side3) || (side1 == side3))
        {
            System.out.println("Isoceles Triangle");
        }
        else
        {
            System.out.println("Scelen Triangle");
        }

    }
}
