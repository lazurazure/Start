package HomeWork;

import java.util.Scanner;

public class L4HW_LanguageChoice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char choice;

        System.out.println("Do you speak English: choose 1" );
        System.out.println("Вы говорите по-русски: выберите 2" );
        System.out.println("Vorbiti romana: selectati 3" );

        choice = input.next().charAt(0);

        if (choice == '1') System.out.println("Hello! How are you?))");
        else if (choice == '2') System.out.println("Привет! Как дела?))");
        else if (choice == '3') System.out.println("Noroc! Ce faci?");
    }
}
