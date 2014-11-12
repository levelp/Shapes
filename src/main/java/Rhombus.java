/**
 * Created by d.tyufanov on 12.11.2014.
 */
public class Rhombus extends Shape{
    Point topConner;
    double diagonal1, diagonal2;

    public Rhombus (String name, Point topConner, double diagonal1, double diagonal2) {
        super(name);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }


    @Override
    void show() {
        // TODO: показать
        System.out.println("The name of figure is " + name);
        System.out.println("Top conner coordinates: x= " + topConner.getX() + ", y= " + topConner.getY());
        System.out.println("Diagonal 1 length = " + diagonal1);
        System.out.println("Diagonal 2 length = " + diagonal2);
    }
}
