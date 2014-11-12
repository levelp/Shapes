/**
 * Created by d.tyufanov on 12.11.2014.
 */
public class Square extends Shape{
    Point leftTop;
    double side;

    public Square (String name, Point leftTop, double side) {
        super(name);
        this.leftTop = leftTop;
        this.side = side;
    }
    @Override
    void show() {
        // TODO: показать
        System.out.println("The name of figure is " + name);
        System.out.println("Left top coordinates: x= " + leftTop.getX() + ", y= " + leftTop.getY());
        System.out.println("Side length = " + side);
    }
}
