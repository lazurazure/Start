package lesson5;

public class ContinueToLabel {
    public static void main(String[] args) {

        outerloop:
        for (int i = 1; i < 10; i++) {
            System.out.print("\nOuter loop: run " + i +" , inner loop: ");
            for (int j = 1; j < 10; j++) {
                if (j == 5) continue outerloop; // метка после continue позволяет продолжить цикл с нужного места - поведение отличное от по умолчанию
                System.out.print(j);
            }
        }
    }
}
