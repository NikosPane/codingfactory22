package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Αποφασίζει αν ένα έτος είναι δίσεκτο (leap year)
 * Δίσεκτο έτος διαιρείται με το 4, δε διαιρείται με το 100
 * και αν διαιρείται με το 100, διαιρείται και με το 400.
 */
public class LeapYearApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        boolean isLeap = false;

        System.out.println("Please provide a year");
        year = in.nextInt();

        isLeap = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                isLeap = true;
            } else if (year % 400 == 0) {
                isLeap = true;
            }
        }
    }
}
