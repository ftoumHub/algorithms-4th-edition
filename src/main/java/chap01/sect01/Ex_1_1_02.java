package chap01.sect01;

/**
 * Give the type and value of each of the following expressions:
 * <p>
 * a. (1 + 2.236)/2
 * b. 1 + 2 + 3 + 4.0
 * c. 4.1 >= 4
 * d. 1 + 2 + "3"
 */
public class Ex_1_1_02 {

    public static void main(String[] args) {

        double a = (1 + 2.236)/2;
        double b = 1 + 2 + 3 + 4.0;
        boolean c = 4.1 >= 4;
        String d = 1 + 2 + "3";

        System.out.println("a) " + a);
        System.out.println("b) " + b);
        System.out.println("c) " + c);
        System.out.println("d) " + d);
    }
}
