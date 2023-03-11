package lesson6;

public class Vehicle {

    int passengers;
    int fuelCap;
    int milesPerGallon;

    void rangeCalculation() {
        System.out.println("Distance is " + fuelCap * milesPerGallon);
    }

    int rangeCalc(){
        return fuelCap * milesPerGallon; // этот метод позволяет возвращать что-то
    }

    void rangeCalculationWithName(String name) { //относится к 15 строке в арр
        System.out.println(name + " can take " + passengers + " passangers at distance of "+ fuelCap * milesPerGallon + ".");
    }

    int pricePerPassanger(int price) {
        return rangeCalc() * price / passengers;
        //return rangeCalc() * price / passengers - позволит возвратить значение для каких-то расчетов
        // пишется последним, но можн описать что-то до него
    }
}