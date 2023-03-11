package lesson3;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class UnexpectedCast {
    public static void main(String[] args) {
        byte b;
        int i;
         b = 10;
         i = b * b;

         b = (byte) (b * b); //  предлагает перевести произведение в byte, т.к. может выйти за границы

        char ch1 = 'a', ch2 = 'b';
        ch1 = (char) (ch1 + ch2);

        for (int k = 0; k < 5; k++){
            System.out.println(k + "/ 3:" + k / 3);
            System.out.println(k + "/ 3: с дробной частью" + (double) k / 3);
            System.out.println();

        }

    }
}
