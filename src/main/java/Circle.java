/**
 *
 */
public class Circle extends Shape {
    private final double radius;
    private final Point p1;

    public Circle(String name, double radius, Point p1) {
        super(name);
        this.radius = radius;
        this.p1 = p1;
    }

    @Override
    void show() {
        System.out.println(this.toString());
    }

    public String toString() {
        return "Название: " + this.name + ";\nРадиус: " + this.radius + ", координаты: " + p1.toString() + ".";
    }
}
