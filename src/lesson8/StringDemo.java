package lesson8;

public class StringDemo {
    public static void main(String[] args) {

        String str = new String("Hello!");

        String str2 = new String(str);
        System.out.println(str);
        System.out.println(str2);

        String str3 = "hello my friend my"; // идентичная запись строчке 6 - без new String - это конструктор
        System.out.println(str3);

        if (str.equals(str2)) System.out.println("equals");//объекты по значению сраыниваем через .equals для класса String - равны ли значения
        else System.out.println("NOT EQUALS");

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.length());
        System.out.println(str.charAt(5));
        System.out.println(str3.compareTo(str2));
        System.out.println(str3.indexOf("my"));
        System.out.println(str3.lastIndexOf("my"));

        String str4 = str + str2 + str3; //- сроки последовательно отражены
        System.out.println(str4);
    }
}
