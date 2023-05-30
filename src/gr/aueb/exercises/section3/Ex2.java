package gr.aueb.exercises.section3;

import java.util.Scanner;

/**
 * Εμφανίζουμε επαναληπτικά ένα μενού με τις παρακάτω
 * επιλογές, το οποίο θα επαναλαμβάνεται μέχρι ο χρήστης να
 * δώσει τον αριθμό 5. Ελέγχουμε επίσης αν ο χρήστης δώσει αριθμό
 * < 0 ή > 5.
 */
public class Ex2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω:");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Επιλογή Εισαγωγής");
                    break;
                case 2:
                    System.out.println("Επιλογή Διαγραφής");
                    break;
                case 3:
                    System.out.println("Επιλογή Ενημέρωσης");
                    break;
                case 4:
                    System.out.println("Επιλογή Αναζήτησης");
                    break;
                case 5:
                    System.out.println("Επιλογή Εξόδου");
                    break;
                // case (choice > 0 && choice < 6).
                default:
                    System.out.println("Επιλέξτε ξανά μία από τις παραπάνω επιλογές");
                    break;
            }
        } while (choice != 5);
    }
}
