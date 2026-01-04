package chap01.sect01;

import edu.princeton.cs.algs4.StdOut;

/**
 * What does the following program print?
 */
public class Ex_1_1_06 {

    public static void main(String[] args) {
        int f = 0; int g = 1;

        for (int i = 0; i <= 15; i++) {
            StdOut.printf("%s,", f); // 0, 1, 1, 2
            f = f + g; // 1, 1, 2, 3, 5
            g = f - g; // 0, 1, 1, 2,
        }
    }
}
