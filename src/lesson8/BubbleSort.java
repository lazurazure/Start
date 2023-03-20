package lesson8;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch;

        System.out.println("Выберите метод сортировки: A - ASC или D - DESC");
        ch = input.next().charAt(0);

        int[] numbers = new int[7];


        numbers = ArrayUtils.randomArray(numbers, -100, 100);
        System.out.println("Initial array: ");
        ArrayUtils.showArray(numbers);

        if (ch == 'D'){
        ArrayUtils.sortArray1(numbers);}
        else {
        ArrayUtils.sortArray2(numbers);}

//
//        for(i = 1; i < numbers.length; i++){
//            for(k = 0, j = numbers.length - 1; j >= i; j--, k++){
//                if(numbers[j - 1] > numbers[j]){
//                    t = numbers[j - 1];
//                    numbers[j - 1] = numbers[j];
//                    numbers[j] = t;
//                }
//                System.out.println("\nIteration " + k + " of inner loop");
////                ArrayUtils.showArray(numbers);
//            }
//
//
  }
}
