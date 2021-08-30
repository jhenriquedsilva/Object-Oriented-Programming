package exercise_seven;

import java.util.Scanner;

public class CorrectMistakes {

    public static void main(String[] args) {
        /*
         * Answer A
         * A final variable cannot be reassigned. So it is necessary to cut off
         * the 'final' keyword for the code to compile
         * final int ARRAY_SIZE = 5; -> previous
         */
        int ARRAY_SIZE = 5; // -> current
        ARRAY_SIZE = 10;

        /*
         * Answer B
         * The last array's index 9. So this piece of code throws
         * an out of bound exception because it tries to get the element
         * at position 10. But that position does not exist. So it is necessary
         * to modify the for loop declaration
         * for (int i = 0; i <= b.length; i++); -> previous
         */
        int[] b = new int[10];
        for (int i = 0; i < b.length; i++) // current
            b[i] = 1;

        /*
         * Answer C
         * There was a simple mistake with the correct syntax to access
         * the element at row 1 and column 1. The wrong syntax looks like this:
         *  a[1,1] = 5;-> previous
         */
        int[][] a = {{1,2},{3,4}}; // Correct one
            a[1][1] = 5;
    }
}
