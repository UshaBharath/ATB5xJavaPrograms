package src.basics_04;

public class Lab063 {
    public static void main(String[] args) {

        //Switch Condition
        //below code will work after JDK 13 versions, it is an advanced feature.
        //Here no need to add break point;
        // -> Arrow is automatically adds break point
        //It takes only one line of sout statement

        int itemCode = 003;
        switch (itemCode){

            case 001 -> System.out.println("It is a Laptop!");
            case 002 -> System.out.println("It's a Desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!'");
            default -> System.out.println("Helloooo!");

        }


    }
}
