package lesson3;

public class AutoCastDemo {
    public static void main(String[] args) {
        int i;
        float f;

        i = 10;

        f = i;
        System.out.println(f);

        //i = f - не даст автоматическое приведение - флоат больше. чем интежер

    }
}
