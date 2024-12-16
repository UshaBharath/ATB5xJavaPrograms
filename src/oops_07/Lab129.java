package src.oops_07;

public class Lab129 {
    public static void main(String[] args) {

        String name = "pehskiN";
        String empty = "";

        for(int i = name.length()-1; i>=0; i--)
        {
            empty = empty +  name.charAt(i);
        }
        System.out.println(empty);
    }
}
