/**
 * Created by Bogdan on 15.11.14.
 */
public class Segment extends Shape{
    Point x;
    Point y;
    public Segment (String name,Point x, Point y){
        super(name);
        this.x=x;
        this.y=y;
    }

    @Override
    void show(){
        System.out.println(toString());
    }
    public String toString() {
        return name+x.toString()+y.toString();
    }
}
