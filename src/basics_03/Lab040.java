package src.basics_03;

public class Lab040 {
    public static void main(String[] args) {
        //Increment Operator
        //Post and Pre Increment

        //Post Increment
        int a = 10;
        System.out.println(a++); //a = a+1 -> Post Increment -> Print the value, then Incremented.
        System.out.println(a);

        //Pre Increment
        int a1 = 10;
        System.out.println(++a1); //a = a1+1 -> Pre Increment ->Increment first, then, Print the value.
        System.out.println(a1);

    }
}
