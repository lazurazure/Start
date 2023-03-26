package lesson12;

public class Triangle extends TwoDShape {
    String style;
    Triangle(double width, double height) {
        super(width, height);
        style = "uncolored";}

    Triangle(double width, double height, String style) {
        super(width, height);
        this.style = style;
    }

    double area(){
        return getHeight() * getWidth()/2;
    }
    void showColor(){
        System.out.println("The triangle is " + style);
    }

}
