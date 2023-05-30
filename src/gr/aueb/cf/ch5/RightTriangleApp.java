package gr.aueb.cf.ch5;

import java.util.Scanner;

public class RightTriangleApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;

        System.out.println("Please provide a, b, c (doubles)");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (Math.abs(Math.pow(a, 2.0)) - (Math.pow(b, 2.0)) + (Math.pow(c, 2.0)) < EPSILON) {
            System.out.println("The triangle is right");
        } else {
            System.out.println("The triangle is not right");
        }
    }
}
