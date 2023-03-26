package lesson12;

public class ColoredTriangle extends Triangle{

    String color;

    ColoredTriangle(double width, double height, String style, String color) {
        super(width, height, style);
        this.color = color;
    }
//------------
    //ПОЛИМОРФИЗМ - если метод переоперделен в детском классе, то
    // вызывается он, если нет, идет исполнение метода из родительского класса
    double area(){
        return super.area();
    }


    @Override // аннотация - переопределили метод System.out.println для вывода св-в обьекта
    public String toString() {
        return "ColoredTriangle{" +
               "width =" + getWidth() +
        ", height=" + getHeight() +
                "color='" + color + '\'' +
                ", style='" + style + '\'' +
                '}';
    }
}
