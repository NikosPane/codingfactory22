package gr.aueb.cf.ch2;

public class RandomDieApp {
    public static void main(String[] args) {
        int die = (int)(Math.random() * 6) + 1; // we typecast into int cause .random delivers only double
        System.out.println(die);
    }
}
