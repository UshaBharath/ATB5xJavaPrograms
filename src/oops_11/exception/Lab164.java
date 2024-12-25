package src.oops_11.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab164 {
    public static void main(String[] args) {
        //Unchecked Exception - Runtime exception
       String name = null;
       name.trim(); //Unchecked Exception

        //Checked Exception - CompileTime - JVM knows about it

        try {
            FileInputStream f = new FileInputStream("sample.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
