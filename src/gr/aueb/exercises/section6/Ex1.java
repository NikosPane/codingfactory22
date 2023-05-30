package gr.aueb.exercises.section6;

import java.util.Arrays;

/**
 * Μία μέθοδος εύρεσης του
 * μέγιστου ενός πίνακα getMaxPosition() που επιστρέφει τη
 * θέση στον πίνακα arr του μέγιστου
 * στοιχείου του πίνακα.
 * Μία μέθοδος εύρεσης του δεύτερου μικρότερου στοιχείου ενός πίνακα getSecondLowest().
 */
public class Ex1 {

    public static void main(String[] args) {

        int[] arr = {10, 226, 15, 4, 103, 50, 2, 47, 81, 9};
        int low = 0;
        int high = arr.length - 1;

        System.out.println("The max value of the array is in position " + (getMaxPosition(arr, low, high) + 1));

        System.out.println("The second lowest value of the array is " + getSecondLowest(arr));
    }

    public static int getMaxPosition(int[] arr, int low, int high) {

        int position = 0;
        for (int i = low; i <= high; i++) {
            if (arr[position] < arr[i]) {
                position = i;
            }
        }
        return position;
    }

    public static int getSecondLowest(int[] arr) {
        Arrays.sort(arr);
        return arr[1];
    }
}
