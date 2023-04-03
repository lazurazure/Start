package HomeWork.L4HW;

import java.util.Scanner;

public class L4HW_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float num1;
        float num2;
        char action;

        System.out.println("Введите первое число: ");
        num1 = input.nextInt();

        System.out.println("Введите второе: ");
        num2 = input.nextInt();

        System.out.println("Выберите математическое действие с этими числами: " + "\nСложение: 1" + "\nСреднее значение: 2" + "\nСравнение: 3");

        action = input.next().charAt(0);

        if (action == '1')
            System.out.println("Сумма введенных чисел равна: " + (num1 + num2));

        else if (action == '2')
            System.out.println("Среднее значение введенных чисел равно: " + ((num1 + num2)/2));

        else if (action == '3') //System.out.println("Сравнение введенных чисел: " + ((num1 + num2)/2));
        {
            if (num1 > num2) System.out.println(num1 + "больше " + num2);
            else System.out.println(num1 + " меньше " + num2);
        }
    }
}
