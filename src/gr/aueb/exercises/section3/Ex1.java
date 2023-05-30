package gr.aueb.exercises.section3;

import java.util.Scanner;

/**
 * Αναπτύσουμε ένα
 * πρόγραμμα που να αποφαίνεται αν
 * ένα έτος είναι δίσεκτο ή όχι.
 * Ο χρήστης δείνει το έτος.
 */
public class Ex1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isLeapYear = false;
        int inputYear = 0;

        System.out.println("Please provide a year:");

        inputYear = in.nextInt();

        if (inputYear % 400 == 0 || inputYear % 4 == 0 && inputYear % 100 != 0) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }

        System.out.println(inputYear + " is leap year: " + isLeapYear);
    }
}
