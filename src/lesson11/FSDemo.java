package lesson11;

public class FSDemo {
    public static void main(String[] args) {

        FailSoftArray fsa = new FailSoftArray(5, -1); // - обьект в котором есть массив
        int x;

        System.out.println("Error handling with no report");

        for (int i = 0; i < (fsa.length * 2); i++){
            boolean isPut = fsa.put(i, i * 10);
            System.out.println(isPut + " ");
        }
        System.out.println();

        for (int i = 0; i < (fsa.length * 2); i++){
            x = fsa.get(i);
            System.out.println(x + " ");
        }
        System.out.println("Error handling with report");

        for (int i = 0; i < (fsa.length * 2); i++){
            if (!fsa.put(i, i * 10)) //false превратили в true с помощью восклицательного знака
                System.out.print("\nIndex " + i + "is out of the range");
        }
        System.out.println();

        for (int i = 0; i < (fsa.length * 2); i++){
            x = fsa.get(i);
            if (x != -1) System.out.println(x + " ");
            else System.out.print("\nIndex " + i + "is out of the range");
        }

    }

}
