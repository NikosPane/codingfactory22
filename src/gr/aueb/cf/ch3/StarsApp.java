package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εκτυπώνει n οριζόντια αστεράκια, όπου n ένας ακέραιος που δίνει ο χρήστης.
 */
public class StarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerOfStars = 0;
        int i = 1;

        System.out.println("Please insert number of stars");
        numerOfStars = in.nextInt();

        while (i <= numerOfStars) {
            System.out.print("*");
            i++;
        }
    }
}
