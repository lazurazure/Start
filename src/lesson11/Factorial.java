package lesson11;

public class Factorial {

    // 5! =1 * 2 * 3 * 4 * 5 - факториал 5ти

     int calcFactorial(int n){ // -рекурсивный подход
         int result;
         if (n == 1) return 1;
         else result = calcFactorial(n - 1) * n;
         return result;
     }

     int calcFactorial2(int n){ // -итеративный подход
         int result, t;
         result = 1;
        for (t = 1; t <= n; t++);
        result *= t;
         return result;
     }


}
