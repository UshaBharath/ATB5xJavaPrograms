package src.basics_03;

public class Lab027 {
    public static void main(String[] args) {
        //casting also called as Molding
        //Widening is the process of converting lower type to higher type
        byte b = 10;
        int a = b; //Implicit casting, by default it changed to (int)b by JVM.


       // Narrowing is the process of converting higher type to lower type
        int a1 = 300;
       // byte b1 = a1; //Invalid Implicit casting
         byte b1 = (byte) a1; //Explicit casting
        System.out.println(b1);

        //int a = 300 > int means, 32 bits memory required
       // 00000000000000000000000100101100
        // byte b1 = (byte)a -> byte means 8 bits memory required
        // 00101100
        //value is 0*27 + 0*26+1*25+0*24+1 *23+1*22+0*21+0*20+0+0+32+0+8+4+0+0==44


    }
}
