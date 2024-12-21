package src.oops_08.basics;

public class Lab133 {
    public static void main(String[] args) {


        //Immutable in nature - can't be changed
        String s1 = "usha";
        String s2 = new String("usha");

        //Mutable in nature - can be changed!!
        StringBuffer sbuf = new StringBuffer("usha");
        sbuf.append("Nikshep");
        System.out.println(sbuf);

        StringBuilder sb = new StringBuilder("usha");
        sb.append(" Bharath");
        System.out.println(sb);
    }
}
