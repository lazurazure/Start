package HomeWork.L7HW;

import lesson8.ArrayUtils;

import java.lang.reflect.Array;

public class Add_25 {
    public static void main(String[] args) {

        float numbers[] = new float[4];
        float numbersResult[] = new float[4];

        float k = 0;

        numbers = HomeUtils.randomArray(numbers, -100.0F, 100.0F);

        HomeUtils.showArray(numbers);
        System.out.println();

        for (int i = 0; i < numbers.length; i++){
            k = (float) (numbers[i] * 0.75);
            //System.out.println(numbers[i]+ " " + i + " " + k + " "); break;
            if (k < 1.0){
               k = (float) (numbers[i] * 1.25);
            }
            numbersResult[i] = k;
        }
//        ArrayUtils.showArray(numbersResult);
        System.out.print(numbersResult);
    }
}
