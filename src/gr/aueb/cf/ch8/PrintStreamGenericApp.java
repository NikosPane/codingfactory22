package gr.aueb.cf.ch8;

import java.io.PrintStream;

public class PrintStreamGenericApp {

    public static void main(String[] args) throws Exception {
        PrintStream ps = new PrintStream("C:/tmp/hcf.txt");

        printMessage(ps, "Hello World!");
        printMessage(System.out, "Hello Coding Factory");
    }

    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }
}
