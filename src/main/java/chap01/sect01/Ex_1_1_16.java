package chap01.sect01;

import edu.princeton.cs.algs4.StdOut;

/**
 * What do each of the following print?
 */
public class Ex_1_1_16 {

    public static void main(String[] args) {
        //System.out.println(exR1(6));
        System.out.println(exR(6));
    }

    public static String exR1(int n) {
        if (n <= 0)
            return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

    public static String exR(int n) {
        StdOut.println("n : " + n);
        if (n <= 0)
            return "";

        return exR(n - 3) + n;
    }
}
