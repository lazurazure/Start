package HomeWork.L7HW;

public class HomeUtils {

    public static int[] randomArray(int[] array, int min, int max ){

        for (int i = 0; i < array.length; i++){
            //(Math.random() * (max - min) + min)
            array[i] = (int)(Math.random() * (max - min) + min); // числа от -100 до 100
        }
        return array;
    }

    public static float[] randomArray(float[] array, float min, float max){

        for (int i = 0; i < array.length; i++){
            //(Math.random() * (max - min) + min)
            array[i] = (int)(Math.random() * (max - min) + min); // числа от -100 до 100
        }
        return array;
    }

    public static void showArray(int[] array){
        for (int i = 0; i < array.length; i++){
//            System.out.print("numbers[" + i + "]= " + array[i] + " ");
            System.out.print(array[i] + " ");
        }
    }

    public static void showArray(float[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static float avgArray(int[] array){
        float sum = 0;
        float average = 0;

        for (int x: array) {
            sum += x;
        }
        average = sum/array.length;
        System.out.println("\nСреднее арифметическое чисел равно: " + average);
        return average;
    }
    public static void compareArrayIntToAvg(int[] array) {
//        int i;
//        double sum = 0;
//        double average = 0;
//
//        for (int x : array)
//            sum += x;
//            average = sum / array.length;
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] < average) average = array[i];
//                if (array[i] > average) average = array[i];
//
//                System.out.println("Самое близкое значение к среднему:" + array[i]);
//            }
//        for (array[0]; array[i] > average; array[0]++);
    }

}



