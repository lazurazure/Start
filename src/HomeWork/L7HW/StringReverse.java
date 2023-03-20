package HomeWork.L7HW;

public class StringReverse {

    public static void main(String[] args) {

        String words = new String("London is the capital of Great Britain");
        String[] wordArray = words.split(" ");
        String maxLengthWord = "";
        int maxLength = 0;

        for (int i = 0; i < wordArray.length; i++){
            System.out.print(wordArray[i] + " ");
            System.out.println(wordArray[i].length());

            if(wordArray[i].length() >= maxLength) {
                maxLength = wordArray[i].length();
                maxLengthWord = wordArray[i];
            }
        }
        System.out.println(maxLengthWord);
    }
}
