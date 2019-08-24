package main;

import java.util.Scanner;

public class Capholder {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double time = obj.nextDouble();
        double v;
        double s;
        v = 9.8 * time;
        s = 0.5 * 9.8 * time * time;
        System.out.println("The speed of the object at 6.0 seconds after its release is " + v + " and the distance the object has travelled in the 6.0 seconds after the relase is " + s);

    }

}
