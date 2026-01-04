package chap01.sect01;

import edu.princeton.cs.algs4.StdOut;

/**
 * What does the following program print?
 */
public class Ex_1_1_07 {

    public static void main(String[] args) {
        //System.out.println(9.0/5.0);
        //ex1();
        //ex2();
        ex3();
    }

    private static void ex1() {
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001) {
            StdOut.println("Pour t = "+t +", Math.abs(t - 9.0/t) vaut : "+Math.abs(t - 9.0/t));
            t = (9.0 / t + t) / 2.0;
            StdOut.println("(9.0 / t + t) / 2.0 :" +t);
        }

        StdOut.printf("%.5f\n", t);
    }

    private static void ex2() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum);
    }

    private static void ex3() {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2)
            for (int j = 0; j < i; j++)
                sum++;
        StdOut.println(sum);
    }
}
