/**
 * Прямоугольник
 */
public class Rectangle extends Shape {
    Point leftTop, righBottom;
    public Rectangle(String name, Point leftTop, Point rightBottom) {
        super(name);
        this.leftTop = leftTop;
        this.righBottom = rightBottom;
    }

    @Override
    void show() {
       // TODO: показать
        System.out.println("The name of figure is " + name);
        System.out.println("Left top coordinates: x= " + leftTop.getX() + ", y= " + leftTop.getY());
        System.out.println("Right bottom coordinates: x= " + righBottom.getX() + ", y= " + righBottom.getY());
    }
}
