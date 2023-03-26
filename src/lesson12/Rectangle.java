package lesson12;

public class Rectangle extends TwoDShape{

    Rectangle(double width, double height) { //запись этого конструктора необходима для связи с
//        родительским классом
          super(width, height);
    }

    boolean isSquare(){
        //более короткая запись тернарный оператор
        return (getHeight() == getWidth() ? true : false);

//        if(height == width) return true;
//        return false;
    }
    double area(){
        return getWidth() * getHeight();
       // return width * height; - после смены модификатора доступа на
        // private у переменных double width и double height такая запись становитьсяневозможной
        // и обращение к переменным неоходимо задавать через геттеры
    }
}
