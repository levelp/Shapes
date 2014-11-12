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
        System.out.println(toString());}


    public String toString() {
        return name + " (" + p1.toString() + "; " + p2.toString() + "; " + p3.toString() + ")";
    }
}
