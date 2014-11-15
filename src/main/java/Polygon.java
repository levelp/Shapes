/**
 * Created by Bogdan on 15.11.14.
 */
public class Polygon extends Shape {


    private Point[] points;

    public Polygon(String name, Point ...points) {
        super(name);
        this.points= points;
    }

    @Override
    void show(){
        System.out.println(toString());

    }



    public String toString() {
        StringBuilder sb = new StringBuilder(name);
        for (Point p:points){
            sb.append(" ");
            sb.append(p.toString());
        }
        return sb.toString();

    }
    public static void main(String[] args){
        Polygon poly1=new Polygon("poly1",
                new Point("a",10,10),
                new Point("b",20,20));
        poly1.show();
    }

}
