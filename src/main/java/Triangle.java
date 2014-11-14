/**
 * Треугольник
 */
public class Triangle extends Shape {
    public Triangle(String name, Point p1, Point p2, Point p3) {
        super(name);
    }

    @Override
    void show() {
        // TODO: показать
        System.out.println("name = " + name);
        System.out.println("x1= " + x1);
        System.out.println("x2= " + x2);
        System.out.println("x3= " + x3);
    }
}
