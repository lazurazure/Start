package lesson4;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch;
        char answer = 'S';

        System.out.println("The letter that you should guess is from the range of A to Z");
        System.out.println("Try to guess it:");

        ch = input.next().charAt(0);

        System.out.println("This is your result: ");
        if (ch == answer) {
            System.out.println("You won!");}
        else {System.out.println("You loose. Your guess is " + ch + ", but the answer " + answer);}

        System.out.println("This will be printed anyway");

        }

    }

