package HomeWork.L7HW;

import lesson8.ArrayUtils;

public class AvgNumber {
    public static void main(String[] args) {

        int numbers[] = new int[4];
        double avgNum = 0;
        double numResult = 0;
        double temp;

        numbers = HomeUtils.randomArray(numbers, -100, 100);

        HomeUtils.showArray(numbers);
        avgNum = HomeUtils.avgArray(numbers);
        //как написать число самое близкое к avg

        HomeUtils.compareArrayIntToAvg(numbers);

        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] > avgNum) {
                temp = numbers[i] - avgNum;
            }
            else {
                temp = avgNum - numbers[i];
            }
            if (i != 1) {
                if (temp < numResult)  {
                    numResult = numbers[i];
                }
            }
            else {
                numResult = numbers[i];
            }

            System.out.println("Разница с avgNum " + temp);
        }

        System.out.println("numResult:  " + numResult);

    }
 }

