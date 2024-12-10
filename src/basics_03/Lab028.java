package src.basics_03;

public class Lab028 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 0.1845f;
       // int total = course + (int)(GST * course);
        //float total = course + GST*course;
        double total = course + GST*course;
        System.out.println(total);
    }
}
