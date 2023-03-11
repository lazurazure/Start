package lesson5;

public class ContinueDemo {
    public static void main(String[] args) {
        int i;

        for (i=0; i<=100; i++){ //выводит только четные числа, т.к. при деление на 2 получается остаток от деления 0 - работает для нечетных чисел, не выводит System.out.println(i)
            if((i%2) != 0) continue;
            System.out.println(i);
        }

//        int i = 0;
//        while (i <= 100){ // в этом случае из-за того, что continue до инкремента, то цикл до него не доходит, но можно инкремент переместить до if чтобы работало
//            if((i%2) != 0) continue;
//            System.out.println(i);
//            i++;
//        }
    }
}
