package src.basics_06;

public class Lab106 {
    public static void main(String[] args) {
        //Arrays using while loop

        int[] marks = new int[4];
        marks[0] = 90;
        marks[1] = 85;
        marks[2] = 70;
        marks[3] = 78;

        int i = 0;
        while(i<marks.length)
        {
            System.out.println(marks[i]);
            i++;
        }
        System.out.println("--- End of Program!!!--- ");


    }
}
