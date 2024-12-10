package src.basics_03;

public class Lab018 {
    public static void main(String[] args) {
        int a =10;
        int b=45;
        System.out.println(a+b);

        String name = "Usha";
        System.out.println(a+name);
        System.out.println(name+a);

        //Interview Question - calculation happen from left to right

        System.out.println(a+b+name);//add integers and then concatenation with string
        System.out.println(name+a+b);//concatenation of string with integer and with another integer


    }
}
