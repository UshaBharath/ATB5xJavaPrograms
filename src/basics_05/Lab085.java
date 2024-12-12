package src.basics_05;

public class Lab085 {
    public static void main(String[] args) {
        //Continue - The continue statement breaks one iteration
        // (in the loop), if a specified condition occurs, and
        // continues with the next iteration in the loop.

        for(int i=0; i<10; i++)
        {
            System.out.println(i);
            if(i==5) continue;
            System.out.println("**After");
        }
    }
}
