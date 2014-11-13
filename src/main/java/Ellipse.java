public class Ellipse extends Shape {
    private Point upperLeftOfRectangle;

    private double height;
    private double width;

    public Ellipse(String name, Point upperLeftOfRectangle, double height, double width) {
        super(name);
        this.upperLeftOfRectangle = upperLeftOfRectangle;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "name=" + name +
                ", upperLeftOfRectangle=" + upperLeftOfRectangle +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    void show() {
        System.out.println(this.toString());
    }
}

