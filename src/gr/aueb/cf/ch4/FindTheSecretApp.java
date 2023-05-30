package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης έχει 10 ευκαιρίες για να βρει το μυστικό κλειδί.
 */
public class FindTheSecretApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET_KEY = 21;
        int num;
        boolean found = false;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Insert the secret key?");
            num = in.nextInt();

            if (num == SECRET_KEY) {
                found = true;
                System.out.println("Access granted, door unlocked!");
                break;
            } else {
                System.out.println("Door locked, try again.");
            }
        }

        if (!found) {
            System.out.println("Door is shut forever.");
            System.exit(1);
        }
    }
}
