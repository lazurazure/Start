package lesson8;

import java.util.Scanner;

public class ArrayUtils {

    static int[] randomArray(int[] array, int min, int max ){

     for (int i = 0; i < array.length; i++){
          //(Math.random() * (max - min) + min)
          array[i] = (int)(Math.random() * (max - min) + min); // числа от -100 до 100
         }
     return array;
    }
    static int[][] randomArray(int[][] array, int min, int max ){

         for(int t = 0; t < array.length; t++){
             for (int i = 0; i < array[t].length; i++){
                 array[t][i] = (int) (Math.random() * (max - min) + min);
             }
         }
     return array;
    }
    static int[] inputArray(int[] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++){
            System.out.println("Enter " + (i+1) + " array element:");
            array[i] = input.nextInt();
         }
     return array;
    }

    static void showArray(int[][] array) {
        for (int t = 0; t < array.length; t++) {
            for (int i = 0; i < array.length; i++) {
                System.out.println("table[" + t + "][" + i + "] = " + array[t][i] + " ");
            }
            System.out.println();
        }
    }
    static void showArray(int[] array){
        for (int i = 0; i < array.length; i++){
//            System.out.print("numbers[" + i + "]= " + array[i] + " ");
            System.out.print(array[i] + " ");
        }
    }
    public static void showArray(char[] array){
        for (char element: array){
            System.out.print(element + " ");
        }
    }    public static void showArray(String[] array){
        for (String element: array){
            System.out.println(element + " ");
        }
    }

    static void showMinMax(int[] array){
        int min, max;
        max = min = array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] < min) min = array[i];
           if(array[i] > max) max = array[i];
       }
        System.out.println("minimum is " + min);
        System.out.println("maximum is " + max);
        }

    public static void sortArray1(int[] array){
        int i, j, t, k;
        for(i = 1; i < array.length; i++){
            for(k = 0, j = array.length - 1; j >= i; j--, k++){
                if(array[j - 1] > array[j]){
                    t = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = t;
                }
                System.out.println("\nIteration " + k + " of inner loop");
//                ArrayUtils.showArray(numbers);
            }
        }
        System.out.println("Sorted?");
        ArrayUtils.showArray(array);
    }

    public static void sortArray2(int[] array){
        int i, j, t, k;
        for(i = 1; i < array.length; i++){
            for(k = 0, j = array.length - 1; j >= i; j--, k++){
                if(array[j - 1] < array[j]){
                    t = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = t;
                }
//                System.out.println("\nIteration " + k + " of inner loop");
//                ArrayUtils.showArray(numbers);
            }
        }
        System.out.println("Sorted?");
        ArrayUtils.showArray(array);
    }
    public static int[] CopyArray(int[] from, int[] to){
        if (to.length >= from.length) {
            for (int i = 0; i < to.length; i++) {
                to[i] = from[i];
            }
        }
        return to;
    }
    public static int sumElements(int[] array, int untilTheElementIndex){
            int result = 0;
        for (int element: array) {
            result += element;
            if(element == untilTheElementIndex) break;
        }
            return result;
    }
    public static void searchElement(int[] array, int wanted) {
        boolean ifFound = false;
        for (int element : array) {
            if (element == wanted) {
                ifFound = true;
            break;
        }
    }
            System.out.println(ifFound?"Found!" : "Not found!");

    }
}
