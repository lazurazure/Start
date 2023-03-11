package lesson4;

import java.io.IOException;

public class InputwithSysInDemo {
    public static void main(String[] args) throws IOException{
        char ch;
        System.out.println("Enter a symbol and press [ENTER]:");
        ch = (char) System.in.read();
        System.out.println("Your entered symbol " + ch);
    }
}
