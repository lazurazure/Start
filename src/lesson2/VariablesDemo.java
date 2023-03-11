package lesson2;

public class VariablesDemo {
    public static void main(String[] args) {

        boolean varBool = true;
        byte varByte = 120;
        char varChar = 'Z';
        double varDouble = 120.9;
        float varFloat = 120.9f;
        int varInt = 2147483647;
        long varLong = 2147483648L;
        short varShort = 32676;

        System.out.println("\nLogical type:");

        System.out.println("This is a value currently stored in the varBool variable:" + varBool + ". The value stored in such variable type might be true or false");

        System.out.println("\nCharacter type:");
        System.out.println("This is a value currently stored in the varByte variable:"+ varByte + ". The value stored in such variable type might be in range from -128 to 127");

        System.out.println("Integer types:");
        System.out.println("This is a value currently stored in the varChar variable:" + varChar + ". The value stored in such variable type might be in range from 0 to 65,536");
        System.out.println("This is a value currently stored in the varLong variable:" + varLong + ". The value stored in such variable type might be in range from -9223372036854775808 to 9223372036854775807");
        System.out.println("This is a value currently stored in the varInt variable:" + varInt + ". The value stored in such variable type might be in range from -2147483648 to 2147483647");
        System.out.println("This is a value currently stored in the varShort variable:" + varShort + ". The value stored in such variable type might be in range from -32768 to 32767");

        System.out.println("\nFloating point types:");
        System.out.println("This is a value currently stored in the varDouble variable:" + varDouble + ". The value stored in such variable type are decimals ");
        System.out.println("This is a value currently stored in the varFloat variable:" + varFloat + ". The value stored in such variable type are decimals ±1.4E-45 to ±3.4028235E+38");
    }
}
