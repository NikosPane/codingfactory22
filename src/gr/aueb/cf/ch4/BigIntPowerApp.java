package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Υπολογίζει τη δύναμη με BigInteger.
 */
public class BigIntPowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int n;
        BigInteger result = new BigInteger("1");

        System.out.println("Please insert base, power");
        a = in.nextInt();
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(a));
        }

        System.out.printf("Result: %,d", result);
    }
}
