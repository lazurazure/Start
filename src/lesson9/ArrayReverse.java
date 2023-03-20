package lesson9;

import lesson8.ArrayUtils;

public class ArrayReverse {
    public static void main(String[] args) {

//        char [] chars = {'a','b', 'c', 'D', 'e'};//нет слова new т.к. массив задан в данном случае задали
//        char [] charsReversed = new char[chars.length];

//        for (int i = 0, j = chars.length - 1; i < chars.length; i++, j--){
//            charsReversed[i] = chars [j];
//        }
//        ArrayUtils.showArray(charsReversed);

        String str = "This line will be reversed";
        String[] strArray = str.split(" ");
        String[] strArrayReversed = str.split(" ");

        ArrayUtils.showArray(strArray);

        for (int i = 0, j = strArray.length - 1; i < strArray.length; i++, j--){
            strArrayReversed[i] = strArray [j];
        }
        ArrayUtils.showArray(strArrayReversed);

    }
}
