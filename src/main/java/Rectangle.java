/**
 * Прямоугольник
 */
public class Rectangle extends Shape {
    private final Point leftTop;
    private final Point rightBottom;

    public Rectangle(String name, Point leftTop, Point rightBottom) {
        super(name);
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }

    @Override
    void show() {
        System.out.println(this.toString());
    }

    public String toString() {
        return "Название: " + this.name + ";\nКоординаты: " + leftTop.toString() + ", " + rightBottom.toString() + ".";
    }
}
