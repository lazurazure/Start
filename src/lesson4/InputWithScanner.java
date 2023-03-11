package lesson4;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class InputWithScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String myString;
        int number1;
        int number2;
        int sum;

        char  l;

        System.out.println("Enter the string");
        myString = input.nextLine();
        System.out.println("myLine is: \"" +  myString + "\"");

        System.out.println("Enter 1st integer");

        number1 = input.nextInt();

        System.out.println("Enter 2nd integer");

        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.println("Sum is " + sum);

        System.out.println("Enter a symbol");

        l = input.next().charAt(0);
        System.out.println("l is" + l);

    }
}
