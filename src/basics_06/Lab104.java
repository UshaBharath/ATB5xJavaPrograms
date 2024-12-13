package src.basics_06;

public class Lab104 {

    public static void main(String[] args) {
        //Different array types

        int[] int_arr = {99, 90, 43, 56, 12};
        float[] f_arr = {99.23f, 90.47f, 43.7f};
        double[] d_arr = {34.23, 54.12, 56.23};
        boolean[] b_arr = {true, false, true, true};
        char[] ch_arr = {'A','B', 'c'};
        String[] names = {"Nikshep", "Monisha", "Manvith"};

        System.out.println(int_arr.length);
        System.out.println(names.length);
        for(int i = 0; i<names.length; i++)
        {
            System.out.println(names[i]);
        }
    }
}
