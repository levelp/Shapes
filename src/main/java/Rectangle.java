/**
 * Прямоугольник
 */
public class Rectangle extends Shape {
    private Point leftTop, rightBottom;
    private Point rightTop, leftBottom;


    public Rectangle(String name, Point leftTop, Point rightBottom) {
        super(name);
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
        this.rightTop  = new Point("right top", this.rightBottom.getX(),this.leftTop.getY());
        this.leftBottom  = new Point("left bottom", this.leftTop.getX(),this.rightBottom.getY());
    }

    public Point getRightTop() {
        return this.rightTop;
    }

    public Point getleftBottom() {
        return this.leftBottom;
    }
    @Override
    void show() {
        System.out.println(toString());
    }
    public String toString() {
        return super.name +": "+ this.leftBottom.toString() + " , " + this.leftTop.toString()+" , "
                + this.rightTop.toString() + " , " + this.rightBottom.toString();
    }
}
