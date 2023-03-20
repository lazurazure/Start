package lesson11;

public class CallByValue {
    public static void main(String[] args) {

        Test ob = new Test();
        int a = 15, b = 20;

        System.out.println("a & b before method call: ");
        System.out.println(a + " " + b);

        ob.noChange(a, b);

        System.out.println("a & b after method call: ");
        System.out.println(a + " " + b);

        Test newOb = new Test(15, 20);
        System.out.println("a & b before method call: ");
        System.out.println(newOb.a + " " + newOb.b);

        newOb.change();

        System.out.println("newOb.a & newOb.b after method call: ");
        System.out.println(newOb.a + " " + newOb.b);
    }
}
