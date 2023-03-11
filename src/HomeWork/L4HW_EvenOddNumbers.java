package HomeWork;

import java.util.Scanner;

public class L4HW_EvenOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i;

        System.out.println("Введите число: ");

        i = input.nextInt();

        if (i % 2 == 0) System.out.println(i + " - это четное число");
        else System.out.println(i + " - это нечетное число");
    }
}
