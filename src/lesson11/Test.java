package lesson11;

public class Test {

    int a,b;
     Test(){
     }
     Test(int a, int b){
      this.a = a;
      this.b = b;
     }

     void noChange (int i, int j){//- метод void не возвращает ничего, но принимает на вход обьект, можно сделать, чтобы тип возващаемого значения был обьект
         i = i + j;
         j = -j;
    }

    void change(){
         a = a + b;
         b = -b;
    }


}
