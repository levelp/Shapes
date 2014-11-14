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
    void show() {
        // TODO: показать
        System.out.println("Эта фигура - " + name);
        System.out.println("Координаты leftTop (x= " + leftTop.getX() +
                "; y= " + leftTop.getY() + ")");
        System.out.println("Координаты rightBottom (x= " + rightBottom.getX() +
                "; y= " + rightBottom.getY() + ")");


    }
}
