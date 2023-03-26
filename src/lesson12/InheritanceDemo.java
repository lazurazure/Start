package lesson12;

public class InheritanceDemo {
    public static void main(String[] args) {

        Triangle t1 = new Triangle(2.5, -5.0);
        Triangle t2 = new Triangle(2.5, -5.0, "red"); // показатель с минусом преобразуется за счет фукции Math.abs в положительное значение
        //TwoDShape t3 = new TwoDShape(-5.0, -6.0); // роидтель от ребенка св-ва не наследует - нет color
        //----после присваивания свойства TwoDShape - abstract обьекты именно этого класса создать не получится,
        // но свойства и методы класса могут наследовать детские обьекты
        Rectangle r4 = new Rectangle(2.5, -7.0);
        ColoredTriangle ct = new ColoredTriangle(2.5, -7.0, "colored", "brown");

        System.out.println("t1 info" );
        t1.showDim();
        t1.showColor();

        System.out.println("t2 info" );
        t2.showDim();
        t2.showColor();

//        System.out.println("t3 info" );
//        t3.showDim();

        System.out.println("r4 info" );
        r4.showDim();
        System.out.println("r4 is a square rectangle : " + r4.isSquare());
        System.out.println("r4 area : " + r4.area());

        System.out.println("ct info" );
        r4.showDim();
        System.out.println("ct style : " + ct.style);
        System.out.println("ct color : " + ct.color);

//        t1.width = 4.0; - запись до назнгачения private переменным, после обращение только через сеттеры
//        t1.height = 4.0;
//        t1.color = "red";
        // ----------------- записи ниже при условии необходиомсти
        // переназначить значения, первоначальные значения задаются через конструктор выше
        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style = "fashionista";

        t2.setWidth(5.0);
        t2.setHeight(7.0);
        t2.style = "narrow";

//        t3.setWidth(5.0);
//        t3.setHeight(7.0);

        r4.setWidth(17.0);
        r4.setHeight(1);

        ct.setWidth(1.0);
        ct.setHeight(1);

        System.out.println("LET'S TRY TO SHOW AN OBJECT");
        System.out.println(ct.area());



    }
}
