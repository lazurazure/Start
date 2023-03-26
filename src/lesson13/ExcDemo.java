package lesson13;

import jdk.jfr.StackTrace;

import java.util.Scanner;

public class ExcDemo {
    public static void main(String[] args) {
        int[] nums = new int[4];
//        Scanner input  = new Scanner(System.in);
//        int i = input.nextInt();

        try{
            System.out.println("Before exception: ");
            //nums[i] = 10;
            nums[10] = 10;
            System.out.println("I want to continue");
        } catch (Exception e){//тип исключения и обьект - правильное название обязательно (ArrayIndexOutOfBoundsException)
            System.out.println("The exception of ArrayIndexOutOfBoundsException has occurred" + e.getMessage() );
        }
        System.out.println("After catch");

        int[] numer = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for(int i = 0; i < numer.length + 5; i++){
            try{
                System.out.println(numer[i] + " / " + denom[i] +  "=" + numer[i]/denom[i]);
            } catch (ArithmeticException e){
                System.out.println("Attempt to divide by zero");
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Attempt to get an element with the index out of bounds");
            }

        }
    }

}
