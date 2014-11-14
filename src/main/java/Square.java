/**
 * Created by darya on 13/11/14.
 */
public class Square extends Shape {
    private Point leftTop;
    private double sideLength;

    public Square(String name, Point leftTop, double sideLength) {
        super(name);
        this.leftTop = leftTop;
        this.sideLength = sideLength;
    }

    @Override
    public void show() {
        System.out.println(toString());
    }

    public String toString() {
        return name + " (" + leftTop.toString() + "; Длина сторны квадрата: " + sideLength + ")";
    }
}
