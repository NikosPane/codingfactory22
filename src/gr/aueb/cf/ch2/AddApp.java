package gr.aueb.cf.ch2;

/**
 * Overflow
 */

public class AddApp {
    public static void main(String[] args) {
        int num1 = 2_147_483_647; // max value
        int num2 = 2;
        int result = 0;

        result = num1 + num2;

        System.out.println("Sum: " + result); // result is overflowed cause of max value of int
    }
}