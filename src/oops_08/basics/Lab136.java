package src.oops_08.basics;

public class Lab136 {
    public static void main(String[] args) {


        //StringBuffer -> Its a Thread safe
        //StringBuilder -> Its not a Thread safe, hence commonly used.

        StringBuilder string_builder = new StringBuilder("Usha");
        string_builder.reverse();
        System.out.println(string_builder);
    }
}
