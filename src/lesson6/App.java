package lesson6;

public class App {
    public static void main(String[] args) {
        int rangeMinivan, rangeSportcar;

        Vehicle minivan = new Vehicle();

        minivan.passengers = 7;
        minivan.fuelCap = 16;
        minivan.milesPerGallon = 21;

        minivan.rangeCalc();

        minivan.rangeCalculationWithName("Minivan");
       //minivan.pricePerPassanger(28);
        int pricePerPassenger = minivan.pricePerPassanger(28);
        System.out.println(pricePerPassenger);

        rangeMinivan = minivan.rangeCalc();
        System.out.println(rangeMinivan);

        Vehicle sportcar = new Vehicle();

        sportcar.passengers = 2;
        sportcar.fuelCap = 14;
        sportcar.milesPerGallon = 12;

        System.out.println("For sportcar: ");

        sportcar.rangeCalculation();

//        Vehicle car1 = new Vehicle(); //создаем обьект через конструктор new, выделяя память
//        Vehicle car2 = car1; // ссылочный обьект(переменные ссылочного типа) будет в таком случае присываиваться значение со ссылкой на другой
//
//        car1.milesPerGallon = 26;
//
//        System.out.println("Miles oer gallon of car1" + car1.milesPerGallon);
//        System.out.println("Miles oer gallon of car1" + car2.milesPerGallon);
//
//        int a = 10;
//        int b = a;
//
//        System.out.println("a is " + a);
//        System.out.println("b is " + b); //примитивы работают по-другому

    }
}

