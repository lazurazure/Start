package HomeWork.L7HW;

public class WordReverse {
    public static void main(String[] args) {

        String word = new String("London");
        String[] lettersArray = word.split("");
        String wordReversed = new String("");

        System.out.println(word);
        for (int i = 0, j = lettersArray.length - 1; i < lettersArray.length; i++, j--){
           wordReversed = wordReversed + lettersArray[j];
        }
        System.out.println(wordReversed);
    }
}
