package src.oops_10.accessModifiers.police;

public class Cop {

    //modifier return type variable
    public int gun;

    public Cop(int gun)
    {
        this.gun = gun;
    }

    protected void canIShoot()
    {
        System.out.println("Ofcourse, shoot");
    }

}
