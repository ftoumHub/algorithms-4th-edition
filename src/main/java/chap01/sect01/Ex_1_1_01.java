package chap01.sect01;

import java.math.BigDecimal;

/**
 * Give the value of each of the following expressions:
 * <p>
 * a. ( 0 + 15 ) / 2
 * b. 2.0e-6 * 100000000.1
 * c. true && false || true && true
 */
public class Ex_1_1_01 {

    public static void main(String[] args) {
        int resultA = (0 + 15) / 2;
        System.out.println(BigDecimal.valueOf(2.0e-6).toPlainString());
        double resultB = 2.0e-6 * 100_000_000.1;
        boolean resultC = true && false || true && true;

        System.out.println("a) " + resultA); // 7
        System.out.println("b) " + resultB); // 200.0000002
        System.out.println("c) " + resultC); // true
    }
}
