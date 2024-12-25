package src.oops_10.accessModifiers.criminal;

import src.oops_10.accessModifiers.police.Cop;

public class Thief {

    public static void main(String[] args) {

        Cop cop = new Cop(10);
        System.out.println(cop.gun);
       //cop.canIShoot();
    }



}
