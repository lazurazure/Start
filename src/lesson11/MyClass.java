package lesson11;

public class MyClass {

    //private//
    private int alpha;//private класс не позволяет обратиться к переменной извне
    public int beta;//класс public делеет переменную доступной
    int gamma; // дефолтный из других мест не виден

    MyClass (int a, int b, int c){
        setAlpha(a);
        beta = b;
        gamma = c;
    }

    private void setAlpha(int a){
        if (a > 0)
            alpha = a;
    }


//    void setAlpha (int a) { //метод сеттер
//        if(alpha != 0)
//            alpha = a;
//        else {
//            alpha = 1;
//            System.out.println("Sorry, value can't be null, enter again");
//        }
//    }
    int getAlpha(){// метод геттер возвращает переменную того же типа
        return alpha;
    }
//
//    double calculateDivision(){
//        return beta/alpha;
//    }

}
