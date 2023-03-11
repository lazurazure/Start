package lesson7;

public class AnimalDemo {
    public static void main(String[] args) {

        Animal tiger;//ссылочная переменная на обьект класса animal

        tiger = new Animal();//обьект

        tiger.run();
        tiger.eat("Meat");
        tiger.isPredator = true;
        System.out.println(tiger.sound());

    }
}
