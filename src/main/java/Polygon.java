/**
 * Многоугольник
 */
public class Polygon extends Shape {
    private Point[] points;

    public Polygon(String name, Point... points) {
        super(name);
        this.points = points;
    }

    public static void main(String[] args) {
        Polygon poly1 = new Polygon("poly1", new Point("A", 1, 2));
        Polygon poly2 = new Polygon("poly2",
                new Point("A", 1, 2), new Point("B", 1, 2));
        poly2.show();

        Polygon poly3 = new Polygon("poly3",
                new Point[]{new Point("A", 1, 2), new Point("B", 1, 2)});
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name);
        for (Point p : points) {
            sb.append(" ");
            sb.append(p.toString());
        }
        return sb.toString();
    }
}
