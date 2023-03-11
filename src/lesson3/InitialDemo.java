package lesson3;

public class InitialDemo {

    public static void main(String[] args) {
        int i;
        i = 8;

        int x, y, z;

        x = y = z = 100;

        x += 10; //x = x + 1;
        System.out.println("initial value of x: " + x);

        x -= 10;//x = x - 10;
        System.out.println("value of x after  += 10 "  + x);

        x *= 10;//x = x * 10;
        System.out.println("value of x after  *= 10 "  + x);

        x /= 10;//x = x / 10;
        System.out.println("value of x after  /= 10 "  + x);

        x %= 10;//x = x % 10;
        System.out.println("value of x after  %= 10 "  + x);

        boolean b1 = true;
        boolean b2 = false;

        System.out.println("Initial data of b1: " + b1);

        b1 &= b2; // b1 = b1 & b2

        System.out.println("value of b1 after  b1 &= b2 " + b1);

        b1 |= b2;

        System.out.println("value of b1 after  b1 |= b2 " + b1);

        b1 ^= b2;

        System.out.println("value of b1 after  b1 ^= b2 " + b1);
    }
}
