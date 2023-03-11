package lesson3;

public class SideEffects {

    public static void main(String[] args) {

        int i = 0;

//        if (false & (++i < 100))
//            System.out.println("This line can't be displayed"); в этом случае инкремент выполняется
//        System.out.println("IF operator is executed: " + i);

        if (false && (++i < 100))
            System.out.println("This line can't be displayed"); // инкремент не выполняется, т.к. первым стоит false и во вторую часть не заглядывает и игнорирует необходимое действие
        System.out.println("IF operator is NOT executed: " + i);
    }
}
