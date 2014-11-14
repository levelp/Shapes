/**
 * Прямоугольник
 */
public class Rectangle extends Shape {
    private Point leftTop, rightBottom;
    public Rectangle(String name, Point leftTop, Point rightBottom) {
        super(name);
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }

    @Override
    public void show() {
        System.out.println(toString());
    }

    public String toString() {
        return name + " (" + leftTop.toString() + "; " + rightBottom.toString() + ")";
    }
}
