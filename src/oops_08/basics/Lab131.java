package src.oops_08.basics;

public class Lab131 {
    public static void main(String[] args) {
        String name = "Usha";
        System.out.println(name.concat(" Nikshep"));
        System.out.println(name + " Manvith");
        System.out.println(name.contains("U"));

        System.out.println(name);

        String str1 = new String("Manvith");

        String expected_result = "password@123";
        String actual_result = "Password@123";
        if(expected_result.equalsIgnoreCase(actual_result));
        {
            System.out.println("Yes");
        }
    }
}
