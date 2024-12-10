package src.basics_03;

public class Lab038 {
    public static void main(String[] args) {
        //Ternary Operator
        //MAX and MIN of two numbers

        int a = 10;
        int b = 20;
        int c = 12;

        //a > b && a > c -> a
        //(a > c ) ? a : c
        //(b>c) ? b : c
        int max = (a > b) ? ((a > c) ? a: c) : ((b > c ) ? b : c);
        System.out.println(max);
    }
}
