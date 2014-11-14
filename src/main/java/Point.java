/**
 * Точка 2D
 */
public class Point extends Shape {
    protected double x, y;

    public Point(String name, double x, double y) {
        super(name);
        this.x = x;
        this.y = y;
    }

    @Override
    public void show() {
        System.out.println(toString());
    }

    public String toString() {
        return name + " (" + x + "; " + y + ")";
    }
}
