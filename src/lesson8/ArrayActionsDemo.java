package lesson8;

public class ArrayActionsDemo {
    public static void main(String[] args) {



        int numbers[] = new int[20];
        int numbers2[] = {1, 67, 80, 23, 128, 48, 60, 50, 85, 15, -50};

        numbers = ArrayUtils.randomArray(numbers, -100, 100);

        ArrayUtils.showArray(numbers2);
        ArrayUtils.showMinMax(numbers2);
    }
}
