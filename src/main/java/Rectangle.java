/**
 * Прямоугольник
 */
public class Rectangle extends Shape {
    Point leftTop;
    Point rightBottom;

    public Rectangle(String name, Point leftTop, Point rightBottom) {
        super(name);
        this.leftTop=leftTop;
        this.rightBottom=rightBottom;
    }

    @Override
    double calcSquare() {
        return ((rightBottom.getX()-leftTop.getX())*(rightBottom.getY()-leftTop.getY()));
    }

    @Override
    double calcPerimeter() {
        return 2*((rightBottom.getX()-leftTop.getX())+(rightBottom.getY()-leftTop.getY()));
    }

    @Override
    void show() {
       // TODO: показать
        System.out.println(name+": "+"площадь "+calcSquare()+", "+"периметр "+calcPerimeter());
    }
}
