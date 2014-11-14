/**
 *
 */
public class Circle extends Shape {
    /**
     *
     */
    public double radius;
    public Point center;
    //public double square;

    public Circle(String name, Point center, double radius) {
        super(name);
        this.radius=radius;
        this.center=center;

    }

    @Override
    double calcSquare() {
        return Math.PI*Math.pow(radius,2);


    }

    @Override
    double calcPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    void show() {
        // TODO: показать
        System.out.println(name+": "+"радиус "+radius+", "+"площадь "+calcSquare()+", "+"периметр "+calcPerimeter());

    }
}
