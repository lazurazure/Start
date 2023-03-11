package lesson8;

public class ArrayDemo {
    public static void main(String[] args) {

        //int numbers[]; - C style array declaration
        //int [] numbers; - java style
        int numbers[] = new int[10];
//        numbers[0] = 35;
//        numbers[1] = -35;
//        numbers[2] = -3;
//        numbers[3] = 17;
//        numbers[4] = 45;
//        numbers[5] = 100997;
//        numbers[6] = 1009779;
//        numbers[7] = -1009779;
//        numbers[8] = -17997;
//        numbers[9] = -1;
//        numbers[10] = -1;
//
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]);
//        System.out.println(numbers[5]);
//        System.out.println(numbers[6]);
//        System.out.println(numbers[7]);
//        System.out.println(numbers[8]);
//        System.out.println(numbers[9]);
//        System.out.println(numbers[10]);

        //инициация членов массива
        for (int i = 0; i < 10; i++){
            numbers[i] = i;
        }

        //принт массива
        for (int i = 0; i < 10; i++){
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}
