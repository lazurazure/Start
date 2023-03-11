package lesson4;

import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
//        int x;
//
//        for (x = 0; x < 6; x++){
//            if (x == 1)
//                System.out.println("x is equal to 1");
//            else if(x == 2)
//                System.out.println("x is equal to 2");
//            else if(x == 3)
//                System.out.println("x is equal to 3");
//            else if(x == 4)
//                System.out.println("x is equal to 4");
//            else System.out.println("x is " + x + " out of range 1 - 4");
//        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter chapter (A or B):");
        char ch1 = input.next().charAt(0);
        char ch2 ;

        switch (ch1){
            case 'A':
                System.out.println("This is \'A\'  a section of our OUTER switch");
                ch2 = input.next().charAt(0);
                System.out.println("This chapter has more than 1 chapter. Please enter the necessary section (I to X)");
                switch (ch2){
                    case '1':
                        System.out.println("This is \'1\'  a section of our INNER switch");
                    case '2':
                        System.out.println("This is \'2\'  a section of our INNER switch");
                }
                break;
            case 'B':
                System.out.println("This is \'A\'  a section of our OUTER switch");
                break;
        }
    }
}
