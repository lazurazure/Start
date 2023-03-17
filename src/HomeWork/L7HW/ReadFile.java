package HomeWork.L7HW;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {


        try {
            File myObj = new File("C:\\Users\\Admin\\IdeaProjects\\Start\\src\\HomeWork\\L7HW\\input.txt");// обьявили переменную и создали обьект myObj
            Scanner myReader = new Scanner(myObj);// обьявили переменную и создали обьект типа Scanner и в конструктор передали обьект типа File
            while (myReader.hasNextLine()) {// пока файл не закончился выполнять следующие действия
                String data = myReader.nextLine();//обьявили переменную и инициализируем ее тем обьектом типа String, который возвращается методом класса Scanner
                String[] strArray = data.split("[^a-zA-Z0-9А-Яа-я]");//обьявили массив (переменную), в которой будут храниться обьекты типа  String
                for(String word : strArray){ //здесь for-each -  для каждого элемента массива
                    if(isPalindrome(word.toLowerCase())) System.out.println(word);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static boolean isPalindrome (String word){
        for (int i = 0; i < word.length() / 2; i++){
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)){
                return false;
            }
        }
        return false;
    }
}
