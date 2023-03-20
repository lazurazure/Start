package lesson11;

public class Overload {

    int a;
    int b;

    Overload(){

    }
    Overload(int a){
        this.a = a;
    }

    Overload(int a, int b){
        this.a = a;
        this.b = b;
    }

    Overload(double a, int b){
        this.a = (int)a;
        this.b = b;
    }

    int sum(int a, int b){
        return a+b;
    }

    int sum(double a, double b){
        return (int)(a + b);
    }

    double sum(double a, int b){
        return a + b;
    }

}
