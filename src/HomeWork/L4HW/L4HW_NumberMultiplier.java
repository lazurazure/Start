package HomeWork.L4HW;

import java.util.Scanner;

public class L4HW_NumberMultiplier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i;
        int j;

        System.out.println("Введите число: ");

        i = input.nextInt();

        System.out.print("\nMultipliers of number" + i + " are: ");
        for (j = 1; j < i; j++) {
            if ((i % j) == 0) System.out.print(j + " ");
        }
    }
}
