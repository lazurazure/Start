package lesson12;

public class DemoI {
    public static void main(String[] args) {
        MyClass ob1 = new MyClass();
        MyClass2 ob2 = new MyClass2();

        System.out.println("ob1 call:");
        ob1.method1();
        ob1.method2();
        ob1.method3();

        System.out.println("ob2 call:");
        //demoInterchange(ob2);
       /* ob2.method1();
        ob2.method2();
        ob2.method3();*/

        demoInterchange(ob1);
        //demoInterchange(ob2);

        MyIFImpl myob1 = new MyIFImpl();
        System.out.println(myob1.getUserID());
        System.out.println(myob1.getAdmin());

        int uID = MyInterface.getUniversalID();
        System.out.println(uID);

    }

    public static void demoInterchange(IB obj){
        obj.method1();
        obj.method2();
        obj.method3();
    }
}
