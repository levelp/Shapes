/**
 * Отрезок
 */
public class Segment extends Shape {
    private Point p1, p2;

    /**
     * @param name имя фигуры
     */
    public Segment(String name, Point p1, Point p2) {
        super(name);
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public void show() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return name + " " + p1 + " - " + p2;
    }
}
