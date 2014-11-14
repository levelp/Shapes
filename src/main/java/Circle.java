/**
 *
 */
public class Circle extends Shape {

    private Point centre;
    private double radius;

    public Circle(String name, double radius, Point centre) {
        super(name);
        this.radius = radius;
        this.centre = centre;

    }

    @Override
    void show() {
        // TODO: показать
        System.out.println("Это " + name);
        System.out.println("Его радиус " + radius);
        System.out.println("Центр (x= " + centre.getX() + "; y= " + centre.getY() + ")");
    }
}
