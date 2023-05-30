package gr.aueb.cf.ch4;

/**
 * Ο frog βρίσκεται στη θέση x και θέλει να φτάσει στη θέση y (ή σε θέση > y).
 * Frog jumps a fixed distance d.
 * Βρίσκει τον ελάχιστο αριθμό jumps που ο frog πρέπει να κάνει ώστε να φτάσει τον στόχο.
 */
public class FrogApp {

    public static void main(String[] args) {
        int jumps = 0;
        int x = 10;
        int y = 85;
        int d = 30;

        jumps = (int)Math.ceil((y - x) / (double)d);
        System.out.print("Jumps: " + jumps);
    }
}
