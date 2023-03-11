package lesson4;

import java.util.Scanner;

public class DecrFor {
    public static void main(String[] args) {
        int x;

        for(x = 100; x > -100; x-=5){ //цикл в обратном направлении - число уменьшается
            System.out.println(x);
        }
        System.out.println("last x is " + x);

        for (int count = 10; count > 5; count++){
            System.out.println("WARNING!!! THIS SHOULD NOT BE PRINTED");
        }//условие, которое никогда не сбудется -> 10 никогда не будет меньше 5

        int i, j;
        for(i = 0, j = 10; i<j; i++, j--) System.out.println("i & j: " + i + " " + j); //условие с 2мя переменными, их может быть и больше

        Scanner input = new Scanner(System.in);

        System.out.println("Guess the symbol to exit.");
        for (i = 0; input.next().charAt(0) != 'q'; i++)
            System.out.println("You did not guess, try again! It's your " + (i+2) + " try:");
        System.out.println("Congrats! good buy!");


//        for(int k = 0; k < 10; k++) - стандартный синтаксис, который можно сокращать
        int k = 0;

        for(; k < 10;){ //вынос "шага" за пределы for + остается ";", указыывая, что инициализация переменной к есть в другом месте
            System.out.println("Run nr.: " + k);
            k++;
        }

    }
}
