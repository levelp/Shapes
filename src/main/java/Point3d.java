/**
 * Created by Bogdan on 15.11.14.
 */
public class Point3d extends Point {
    protected double z;
    public Point3d(String name, double x, double y, double z) {
        super(name, x, y);
        this.z=z;

    }
    @Override
    public String toString() {
        return name + " (" + x + "; " + y + ";" + z + ")";
    }
}
