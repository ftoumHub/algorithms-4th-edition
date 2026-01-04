package chap01.sect01;

/**
 * What (if anything ) is wrong with each of the following statements?
 * <p>
 * a. if (a > b) then c = 0;
 * b. if a > b { c = 0; }
 * c. if (a > b) c = 0;
 * d. if (a > b) c = 0 else b = 0;
 */
public class Ex_1_1_04 {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c = 0;

        // if (a > b) then c = 0; No such keyword as "then" in Java language
        // if a > b { c = 0; } Missing Parentheses on if conditional
        if (a > b) c = 0; // Nothing wrong
        // if (a > b) c = 0 else b = 0; Missing semicolon after the "then" clause
    }

}
