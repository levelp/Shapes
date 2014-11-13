/**
 * Created by d.tyufanov on 12.11.2014.
 */
public class Line extends Shape {
    private Point p1,p2;

    public Line (String name, Point p1, Point p2) {
        super(name);
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    void show() {
        // TODO: показать
        System.out.println("The name of figure is " + name);
        System.out.println("1st point coordinates: x= " + p1.getX() + ", y= " + p1.getY());
        System.out.println("2nd point coordinates: x= " + p2.getX() + ", y= " + p2.getY());
    }
}
