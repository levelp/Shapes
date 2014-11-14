/**
 * Треугольник
 */
public class Triangle extends Shape {
    private Point p1, p2, p3;

    public Triangle(String name, Point p1, Point p2, Point p3) {
        super(name);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

    }

    @Override
    void show() {
        // TODO: показать
        System.out.println("Эта фигура - " + name);
        System.out.println("Координаты вершин ");
        System.out.println("p1 (x= " + p1.getY() + "; y=" + p1.getY() + ")");
        System.out.println("p2 (x= " + p2.getY() + "; y=" + p2.getY() + ")");
        System.out.println("p3 (x= " + p3.getY() + "; y=" + p3.getY() + ")");

    }
}
