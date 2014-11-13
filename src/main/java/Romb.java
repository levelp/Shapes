/**
 * ромб
 */
import static java.lang.Math.*;

public class Romb extends Shape {
//cylinder
    private Point center;
    private double d,D,side;
    private Point left, top, right, bottom;


    public Romb(String name, Point center, double d, double D){
        super(name);
        this.d = d;
        this.D = D;
        this.center = center;
        this.side = sqrt(D*D+d*d)/2;
        this.left  = new Point("left",this.center.getX()-d/2,this.center.getY());
        this.top   = new Point("top",this.center.getX(),this.center.getY()+D/2);
        this.right  = new Point("right",this.center.getX()+d/2,this.center.getY());
        this.bottom   = new Point("bottom",this.center.getX(),this.center.getY()-D/2);
    }

    public double getSide(){
        return  this.side;
    }

    public Point getLeft(){
        return this.left;
    }

    public Point getRight(){
        return this.right;
    }

    public Point getBottom(){
        return this.bottom;
    }

    public Point getTop(){
        return this.top;
    }

    public double area(){
        double area = d*D/2;
        return  area;
    }

    @Override
    void show() {
        System.out.println(toString());
    }
    public String toString() {
        return super.name +": "+ this.left.toString()+ " , " + this.top.toString()+ " , " + this.right.toString()+ " , " + this.bottom.toString();
    }
}
