package src.basics_03;

public class Lab029 {
    public static void main(String[] args) {

        //String Constant Pool(SCP) / String Pool
        String  s1 = "Usha"; // here, value is created in SCP

        //new operator - values are created in Object area. It returns the address of the newly created object.
        String s2 = new String("Usha");

        //s1 == s2, it checks for the reference  -> False
        //s1.equals(s2), it checks for the values -> true
    }
}
