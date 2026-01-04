package chap01.sect01;

/**
 * https://www.positron-libre.com/cours/electronique/systeme-numeration/nombre-virgule-flottante.php
 *
 * https://stackoverflow.com/questions/6359847/convert-double-to-binary-representation
 */
public class Ex_1_1_01_annexe {

    private static final String ZEROS = "0000000000000000000000000000000000000000000000000000000000000000";

    public static void main(String[] args) {

        Double d = 2.0e-6;
        Double d2 = 0.000002;

        extracted(d);
        extracted(d2);
    }

    private static void extracted(Double d) {
        String binary = Long.toBinaryString(Double.doubleToRawLongBits(d));
        String bin = ZEROS.substring(binary.length()) + binary;

        System.out.printf("Représentaion binaire de %s : %s\n", d, bin );
        System.out.println("Taille : "+ bin.length() );
    }

    // https://web.maths.unsw.edu.au/~lafaye/CCM/java/javatype.htm


}
