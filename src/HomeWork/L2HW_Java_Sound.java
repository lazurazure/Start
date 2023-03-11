package HomeWork;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class L2HW_Java_Sound {
public static void main(String[] args) {
//        double dist;
//        dist = 1100 * (7.2/2);
//        System.out.println("Расстояние до скалы составляет " + dist + " футов.");
//    }

    double EchoTime;
    double lightningTime;
    Scanner input = new Scanner(System.in);
    System.out.println("Сколько времени прошло между вспышкой  и ударом грома?");
    lightningTime = input.nextDouble();

    System.out.println("Сколько времени в секундах прошло до того, как вы услышали эхо?");
    EchoTime = input.nextDouble();

    double lightningDist = 343 * lightningTime;

    double objectDist = 343 * EchoTime / 2.0;

    System.out.println("Растояние до места удара составляет " + lightningDist + " метров");
    System.out.println("Растояние до места объекта составляет " + objectDist + " метров");

}
}
