package src.basics_06;

public class Lab099 {
    public static void main(String[] args) {
        //In Array, index starts from 0 and
        //length starts from 1
        //index is from 0 to (length-1)

        int[] marks_10 = {96, 90, 87, 56};
        System.out.println(marks_10.length);
        System.out.println(marks_10[0]);
        System.out.println(marks_10[1]);
        System.out.println(marks_10[2]);
        System.out.println(marks_10[3]);
        //System.out.println(marks_10[4]);//Exception ArrayIndexOutofBound

        int[] a = new int[4];
        //a[0,0,0,0] -> default value of int is 0
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

        a[0] = 78;
        System.out.println(a[0]);

        final int[] b = new int[4]; //if it is final, then size can't be changed
        //but can change the values


    }
}
