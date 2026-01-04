package chap01.sect01;

/**
 * Write a program that takes three integer command-line arguments and prints
 * equal if all three are equal, and not equal otherwise.
 */
public class Ex_1_1_03 {

    public static void main(String[] args) {
        isEqual(new String[]{"2", "2", "2"});

        isEqual(new String[]{"2", "1", "2"});
    }

    private static void isEqual(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a == b && b == c) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
