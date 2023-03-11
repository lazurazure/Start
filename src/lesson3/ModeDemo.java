package lesson3;

public class ModeDemo {
    public static void main(String[] args) {
        int iresult, irem;
        double dresult, drem;

        iresult = 10 / 3;
        irem = 10 % 3; //деление по модулю

        dresult = 10.0 / 3.0;
        drem = 10 % 3;

        System.out.println("Результат и остаток деления 10 / 3 " + iresult + " " + irem);
        System.out.println("Результат и остаток деления 10.0 / 3.0 " + dresult + " " + drem);

    }
}
