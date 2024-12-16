package src.oops_07;

public class Lab125 {
    public static void main(String[] args) {

        //Print diagnol numbers from array

        int[][] arr_2d = new int[3][3];
        arr_2d[0][0] = 1;
        arr_2d[0][1] = 2;
        arr_2d[0][2] = 3;
        arr_2d[1][0] = 4;
        arr_2d[1][1] = 5;
        arr_2d[1][2] = 6;
        arr_2d[2][0] = 7;
        arr_2d[2][1] = 8;
        arr_2d[2][2] = 9;


//        for(int i = 0; i< arr_2d.length; i++)
//        {
//            System.out.println(arr_2d[i][i]);
//        }
        for(int i = 0; i< arr_2d.length; i++)
            {
                for(int j = 0; j< arr_2d.length; j++)
                {
                    if(i==j)
                    {
                        System.out.println(arr_2d[i][j]);
                    }
                }

            }

        //to print all the elements
//        for(int i = 0; i< arr_2d.length; i++)
//        {
//            for(int j = 0; j< arr_2d.length; j++)
//            {
//                System.out.print("\t"+arr_2d[i][j]);
//            }
//            System.out.println();
        }
    }
