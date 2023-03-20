package lesson10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public static void main(String[] args) {

        Pattern myPattern = Pattern.compile("stopIT", Pattern.CASE_INSENSITIVE);// то, что мы ищем без учетв регистра
        Matcher myMatcher = myPattern.matcher("Visit StepIT!");// указание в чем мы ищем

        boolean matchFound = myMatcher.find();

        if(matchFound){// find метод matcher'a, который возвращает true/false
            //if (yMatcher.find()) - один из вариантов записи
            System.out.println("Match found!");
        } else {
            System.out.println("Match not found.");
        }

        System.out.println(Pattern.matches("a-zA-z0-9{6}", "arun32")); // выдаст true, т.к. arun32 состоит из 6 символов, вхлдящих в указанные диапазоны в regex'e
        System.out.println(Pattern.matches("[78]{2}\\d{9}]", "78hjsdgv548")); // выдаст false, т.к. input состоит не только из цифр
        System.out.println(Pattern.matches("[78]{2}[0-9]{9}]", "78625493587")); // выдаст true \\d и 0-9 взаимозаменимы

        final String EXAMPLE_TEXT = "This is an example of a text , please check it if got correct . here !"; // - final выражение, которое нельзя менять
        String pattern = "(\\w)(\\s+)([\\.,\\?\\!])";// - ищет любые буквы/цифры (\w), пробелы (\s+) и знаки
        System.out.println(EXAMPLE_TEXT.replaceAll(pattern, "$1$3")); //убрал лишние пробелы

// https://regex101.com/ - он-лайн тренажер с возможностью создания regular expressions и проверить, что будет работать
    }
}
