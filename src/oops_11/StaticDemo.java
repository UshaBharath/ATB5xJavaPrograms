package src.oops_11;

import com.sun.security.jgss.GSSUtil;

public class StaticDemo {

    //Static Variable

    public static String college_name = "TheTestingAcademy";

    //Non static variable - Local variable or Instance variable

    public int version = 3;

    //Static method

    public static void printName()
    {
        System.out.println("Name is "+ college_name);
        //Can't access instance variable in static method till object creation.
        //System.out.println("Version "+ version);
    }

    //Non static method

    public void printVersion()
    {
        System.out.println("Version "+ version);
        System.out.println("Name is "+ college_name);
    }
}
