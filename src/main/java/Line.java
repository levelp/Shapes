public class Line extends Shape {

    private Point point1;
    private Point point2;

    public Line(String name, Point point1, Point point2) {
        super(name);
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public String toString() {
        return "Line{" +
                "name=" + name +
                ", point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }

    @Override
    void show() {
        System.out.println(this.toString());
    }
}
