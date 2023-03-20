package lesson11;

public class OverloadDemoAndFactorial {
    public static void main(String[] args) {

        Overload myObj = new Overload();
        Overload myObj1 = new Overload(3);
        Overload myObj2 = new Overload(3, 7);
        Overload myObj3 = new Overload(3.0,7);

    }

    //------Factorial ---------------------

//    Factorial f = new Factorial();
//   System.out.println("Recursive method calculation: ");
//    System.out.println("Factorial of 4 is equal to " + f.calcFactorial(4));
//    System.out.println("Factorial of 3 is equal to " + f.calcFactorial(3));
//    System.out.println("Factorial of 2 is equal to " + f.calcFactorial(2));
//    System.out.println("Factorial of 1 is equal to " + f.calcFactorial(1));

}
