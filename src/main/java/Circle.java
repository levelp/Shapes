/**
 *
 */
public class Circle extends Shape {
    private double radius;
    private Point center;

    public Circle(String name, Point center, double radius) {
        super(name);
        this.center = center;
        this.radius = radius;
    }

    @Override
    void show() {
        System.out.println(toString());
    }

        public String toString() {
            return name + " (" + center.toString() + "; Радиус круга: " + radius + "))";
    }

}
