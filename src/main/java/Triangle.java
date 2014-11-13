/**
 * Треугольник
 */
public class Triangle extends Shape {
    private Point p1,p2,p3;

    public Triangle(String name, Point p1, Point p2, Point p3) {
        super(name);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    void show() {
        // TODO: показать
        System.out.println("The name of figure is " + name);
        System.out.println("1st conner coordinates: x= " + p1.getX() + ", y= " + p1.getY());
        System.out.println("2nd conner coordinates: x= " + p2.getX() + ", y= " + p2.getY());
        System.out.println("3d conner coordinates: x= " + p3.getX() + ", y= " + p3.getY());
    }
}
