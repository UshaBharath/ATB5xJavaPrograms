package src.basics_05;

public class Lab082 {
    public static void main(String[] args) {
        //Print ODD numbers from 1 to 50

//        for (int i = 1; i <= 50; i++)
//        {
//            if(i%2==1)
//            {
//                System.out.println(i + " is ODD");
//            }
//        }

        for (int i = 50; i >0; i--)
        {
            if(!(i%2==1)) // can use (i%2==0)
            {
                System.out.println(i + " is Even");
            }
        }
    }
}
