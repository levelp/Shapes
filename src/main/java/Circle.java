/**
 *fomula circle (x-x0)^2 + (y-y0)^2 = R^2
 */
public class Circle extends Shape {
    private double radius;
    private Point center;
    private double currentX, currentY;

    public Circle(String name, Point center, double radius) {
        super(name);
        this.center = center;
        this.radius = radius;
    }

    @Override
    void show() {
        // TODO: показать
//        showCircle(100D, 100D);
        System.out.println("The name of figure is " + name);
        System.out.println("Current center coordinates: x= " + center.getX() + ", y= " + center.getY());
        System.out.println("Radus figure " + name + " = " + radius);
    }

    void showCircle (double currentX, double currentY) {

        this.currentX = calculatePixelsX(center, radius, currentY);
        this.currentY = calculatePixelsY(center, radius, currentX);
        System.out.println("current pixel coordinates: x= " + currentX + ", y= " + currentY);
        // TODO: показать
    }

    public double calculatePixelsX (Point centerCircle, double radius, double currentY) {

        // (x-x0)^2 + (y-y0)^2 = R^2
        //calculate pixels of circle
        /*for (double y = (centerCircle.getY() + radius); y > (centerCircle.getY() - radius); y--) {
            double currentX = Math.sqrt(radius * radius - (y - centerCircle.getY()) * (y - centerCircle.getY()));
        }*/
        return Math.sqrt(radius * radius - (currentY - centerCircle.getY()) * (currentY - centerCircle.getY())) + centerCircle.getX();
    }

    public double calculatePixelsY (Point centerCircle, double radius, double currentX) {

        return Math.sqrt(radius * radius - (currentX - centerCircle.getX()) * (currentX - centerCircle.getX())) + centerCircle.getY();
    }
}
