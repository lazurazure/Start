package lesson4;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {

        int i;
        Scanner input = new Scanner(System.in);

        i = 0; //дальше синонимичные записи

        do {
            System.out.println("Enter another i: ");
            i = input.nextInt();
        } while (i > 0);

        while (i > 0) {
            System.out.println("Enter another i: ");
            i = input.nextInt();
        }

        for (;i > 0;) {
            System.out.println("Enter another i: ");
            i = input.nextInt();
        }

    }
}
