package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Switch instead of if-then-else if.
 * Guess a user's choice based on a menu and returns a feedback.
 */
public class SwitchCaseApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please select one of the following:");
            System.out.println("1. One-player game:");
            System.out.println("2. Two-player game:");
            System.out.println("3. Team game:");
            System.out.println("4. Quit:");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Start One-player game");
                    break;
                case 2:
                    System.out.println("Start Two-player game");
                    break;
                case 3:
                    System.out.println("Start Team game");
                    break;
                case 4:
                    System.out.println("Quit game");
                    break;
                default:
                    System.out.println("Error input");
                    break;
            }
        } while (choice != 4);

        System.out.println("Goodbye");
    }
}
