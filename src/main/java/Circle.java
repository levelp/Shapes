public class Circle extends Shape {

    private Point center;

    private double radius;

    public Circle(String name, Point center, double radius) {
        super(name);
        this.center = center;
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "name=" + name +
                ", center=" + center +
                ", radius=" + radius +
                '}';
    }

    @Override
    void show() {
        System.out.println(this.toString());

    }
}
