/**
 * Точка 3D
 */
public class Point3D extends Point {
    private final double z;

    public Point3D(String name, double x, double y, double z) {
        super(name, x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return name + " (" + x + "; " + y + "; " + z + ")";
    }
}
