package src.basics_04;

import java.util.Scanner;

public class Lab059 {
    public static void main(String[] args) {

        //Switch Condition
        //Supported data types in Switch

        int a = 30;
        switch (a){}

        char ch = 'A';
        switch(ch){}

        float f = 30.9f; // float is not supported, do explicit casting to int
        switch((int)f){}

//        double d = 30.0;// double is not supported, do explicit casting to int
//        switch(d){}
//
//        boolean b = true;// boolean is not supported.
//        switch(b){}
//
//        long l = 20; //long is not supported, do explicit casting to int
//        switch(l){}
    }
}
