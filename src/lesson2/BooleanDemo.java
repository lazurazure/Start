package lesson2;

public class BooleanDemo {
    public static void main(String[] args) {

        boolean b;

        System.out.println("Value of b is true:");

        b = true;

        System.out.println("Now b is " + b);
        if (b){
            System.out.println("This instruction is executed");
        }

        System.out.println("Case when b is false");
        b = false;
        if (b){
            System.out.println("Now b is " + b);
            System.out.println("This instruction is not executed");
        }
    }
}
