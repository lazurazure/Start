package HomeWork.L7HW;

import java.lang.reflect.Array;

public class Add_25 {
    public static void main(String[] args) {

        float numbers[] = new float[4];
        float k = 0;

        numbers = HomeUtils.randomArray(numbers, -100.0F, 100.0F);

        HomeUtils.showArray(numbers);
        System.out.println();

        for (int i = 0; i < numbers.length; i++){
            k = (float) (numbers[i] * 0.75);
            if (k <= 0){
               k = (float) (numbers[i] * 1.75);
            }
            System.out.print(numbers[(int) k] + " ");
        }
    }
}
