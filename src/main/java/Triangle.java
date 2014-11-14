/**
 * Треугольник
 */
public class Triangle extends Shape {
    public Point p1,p2,p3;

    public Triangle(String name, Point p1, Point p2, Point p3) {
        super(name);
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }

    @Override
    double calcSquare() {
        return 0;
    }

    @Override
    double calcPerimeter() {
        return 0;
    }

    @Override
    void show() {
        // TODO: показать
        System.out.println("Это "+name);
        System.out.println("Координаты вершин: p1="+ p1.getX()+","+p1.getY()+"; "+ "" +
                "p2="+p2.getX()+","+p2.getY()+"; "+ "p3="+p3.getX()+","+p3.getY());
    }
}
