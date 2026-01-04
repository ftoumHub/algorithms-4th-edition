package chap01.sect01;

import edu.princeton.cs.algs4.StdOut;

/**
 * Write a code fragment that prints true if the double variables x and y are both
 * strictly between 0 and 1 and false otherwise.
 */
public class Ex_1_1_05 {

    public static void main(String[] args) {
        isStrictlyBetween0And1(1.12, 1.33);
        StdOut.println("Expected: false");

        isStrictlyBetween0And1(0.2, 1);
        StdOut.println("Expected: false");

        isStrictlyBetween0And1(0.5, 0.75);
        StdOut.println("Expected: true");
    }

    private static void isStrictlyBetween0And1(double x, double y) {
        if (0.0 < x && x < 1.0 && 0.0 < y && y < 1.0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
