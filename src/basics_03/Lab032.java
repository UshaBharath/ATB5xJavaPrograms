package src.basics_03;

public class Lab032 {
    public static void main(String[] args) {
        String name = "The Testing Academy"; // String created in String Constant pool/SCP
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String s1 = new String("The Testing Academy classes");// Created in Object Area/ Heap Area
    }
}
