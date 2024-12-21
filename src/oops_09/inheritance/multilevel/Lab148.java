package src.oops_09.inheritance.multilevel;

public class Lab148 {
    public static void main(String[] args) {

        GrandFather g = new GrandFather();
        g.bhk3();

        Father f = new Father();
        f.bhk2();
        f.bhk3();

        Son s = new Son();
        s.bhk1();
        s.bhk2();
        s.bhk3();
    }
}
