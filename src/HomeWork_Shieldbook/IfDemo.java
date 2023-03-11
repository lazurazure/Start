package HomeWork_Shieldbook;

public class IfDemo {
    public static void main(String[] args) {
        int a,b,c;
        a = 2;
        b = 3;

         if(a < b) System.out.println("а меньше b");
         // следующая строка никогда не может быть выведена
        if(a == b) System.out.println("вы не должны увидеть этот текст");

        System.out.println();

        c = a - b; //переменнная с содержит значение -1
        System.out.println("с содержит -1");
        if(c >= 0) System.out.println("с - не отрицательное число");
        if(c < 0) System.out.println("с - отрицательное число");

        System.out.println();

        c = b - a;
        System.out.println("с содержит 1");
        if(c >= 0) System.out.println("с - не отрицательное число");
        if(c < 0) System.out.println("с - отрицательное число");

    }
}
