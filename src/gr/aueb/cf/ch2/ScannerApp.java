package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάζει από το std input (πληκτρολόγιο) δύο ακεραίους και τους προσθέτει.
 */

public class ScannerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        System.out.println("Please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.printf("The sum of the two integers are: " + sum);
    }
}
