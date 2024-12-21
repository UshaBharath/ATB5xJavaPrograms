package src.oops_08.basics;

public class Lab132 {
    public static void main(String[] args) {

        String str1 = "usha";
        String str2 = new String("usha");
        String str3 = new String("Usha");

        System.out.println(str1 == str2);


        System.out.println(str1.equals(str2));


        System.out.println(str1.equalsIgnoreCase(str3));

    }
}
