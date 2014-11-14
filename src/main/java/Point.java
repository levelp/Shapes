/**
 * Точка
 */
public class Point extends Shape {
    private double x, y;

    public Point(String name, double x, double y) {
        super(name);
        this.x = x;
        this.y = y;
    }

    @Override
    double calcSquare() {
        return 0;
    }

    @Override
    double calcPerimeter() {
        return 0;
    }

    double getX(){
        return x;
    }

    double getY(){
        return y;
    }

    @Override
    void show() {
        System.out.println(toString());
    }

    public String toString() {
        return name + " (" + x + "; " + y + ")";
    }
}
