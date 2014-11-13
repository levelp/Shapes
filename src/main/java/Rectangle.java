public class Rectangle extends Shape {

    private Point leftTop;

    private Point righBottom;

    public Rectangle(String name, Point leftTop, Point rightBottom) {
        super(name);
        this.leftTop = leftTop;
        this.righBottom = rightBottom;
    }

    @Override
    void show() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name=" + name +
                ", leftTop=" + leftTop +
                ", righBottom=" + righBottom +
                '}';
    }
}
