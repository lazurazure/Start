package lesson12;

//public class TwoDShape {
abstract class TwoDShape {

    private double width;
    private double height;

    TwoDShape(double width, double height){ //конструктор
//        this.width = width; - запись меняется после необходимости отсечь отрицательные значения
//        this.height = height;
        setWidth(width);
        setHeight(height);
    }

//    TwoDShape(){
//
//    }

    void showDim(){
        System.out.println("Width and height are equal to " + width + " " + height);

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
//        if (width > 0) - в случае отрицательного значения приводит значение к нулю
        this.width = Math.abs(width);//-конвертит заданные отрицательные значения в положительные
    }

    public void setHeight(double height) {
        if (height > 0)
        this.height = Math.abs(height);
    }
    abstract double area();//-абстрактные методы не имеют тела - формула указывается в детских классах,
    //абстрактные методы обязательны к исполнению наследниками
    //нет тела метода - только сигнатура, требование к классам-потомкам - его переопределить

    final void itsFinal(){//final - метод, который запрещает переопределять метод, как он работает
        System.out.println("FINAL");
    }

    @Override// обычно указывают в самом конце, на быстродействие не влияет
    public String toString() { //можно модифицировать, вызывается через generate -> toString -
        //позволяет сгенерачить свойства обьекта класса будет все выводить куском
        return "TwoDShape{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
