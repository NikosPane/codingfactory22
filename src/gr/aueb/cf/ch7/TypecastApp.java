package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Typecast from String to Int
 */
public class TypecastApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lexeme;
        int num;

        System.out.println("Please insert a num (int)");
        lexeme = in.next();
        num = Integer.parseInt(lexeme);

        System.out.println("Num is " + num);
    }
}
