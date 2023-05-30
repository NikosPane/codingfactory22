package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει a εις την n
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int n;
        int result;

        System.out.println("Please insert a num and a power");
        a = in.nextInt();
        n = in.nextInt();

        result = pow(a, n);

        System.out.printf("Result of %d power %d = %d", a, n, result);
    }

    public static int pow(int a, int n) {
        int power = 1;
        for (int i = 1; i <= n; i++) {
            power *= a;
        }
        return power;
    }
}
