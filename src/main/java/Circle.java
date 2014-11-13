/**
 *
 */
public class Circle extends Shape {
    //центр круга
    private Point center;
    private double radius;

    public Circle(String name, Point center, double radius) {
        super(name);
        this.center = center;
        this.radius = radius;

    }
    public Point getCenter(){
        return this.center;
    }

    public double getRadius(){
        return this.radius;
    }

    @Override
    void show() {
        System.out.println(toString());
    }
    public String toString() {
        return super.name +": " + center.toString()+" , radius: "+radius;
    }
}
