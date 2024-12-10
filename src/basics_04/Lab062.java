package src.basics_04;

public class Lab062 {
    public static void main(String[] args) {

        //Switch Condition
        //below code will work after JDK 13 versions, it is an advanced feature.

        int itemCode = 002;
        switch (itemCode){

            case 001, 002, 003:
                System.out.println("It is an Electronic Gadget!");
                break;
            case 004, 005:
                System.out.println("It is an Mechanical Device!");
                break;
            default:
                System.out.println("It is a Software Product!");

        }


    }
}
