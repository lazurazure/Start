package lesson7;

import lesson12.Growable;

public class Animal implements Growable {

    float size;//атрибуты класса
    boolean isPredator;
    String colour;

    //методы класса:
    void run (){//ничего не возвращает, не принимает(пустые скобки)
        System.out.println("I'm running");
    }
    void eat(String food){
        System.out.println("I'm eating " + food);
    }//ничего не возвращает, принимает данные типа стринг
    String sound(){
        if (isPredator) return "Roar";
        else return "Cry";
    }

    //-------- методы имлементированы через Animal implements Growable -> правое меню - сделать обязательно
    @Override
    public void eat() {
        System.out.println("Om-nom-nom");
    }

    @Override
    public void sleep() {
        System.out.println("Hrrr-rrr");

    }

    @Override
    public int changeSize(int previousSizeInCM) {
        return previousSizeInCM++;
    }
}
