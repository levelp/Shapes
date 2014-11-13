import org.junit.Assert;
import org.junit.Test;

public class ShapesTest {

    /**
     * Требуется создать массив фигур.
     * Проинциализировать его разными фигурами.
     * Вызывать метод show() в цикле.
     * Для каждой фигуры нужно выводить её название
     * и все её параметры.
     */
    @Test
    public void shapesArray() {

        boolean isArraysShowCorrect = true;


        System.out.println("TEST: Shapes array test.\n");

        Shape[] shapes = {
                new Circle("Circle", new Point("C", 2, 3), 7),
                new Ellipse("Ellipse",new Point("A",3,4),5,10),
                new Line("Line", new Point("Point1", 10, 20),new Point("Point2", 12, 22)),
                new Point("Point",100, 200),
                new Rectangle("Rectangle", new Point("ULC", 10, 20), new Point("BRC", 100, 230) ),
                new Triangle("Triangle", new Point("A", 1, 2), new Point("B", 3, 5), new Point("C", 6, 7)),
        };


        String [] expectShapesOut = new String[]{
                "Circle{name=Circle, center=Point{name=C, x=2.0, y=3.0}, radius=7.0}",
                "Ellipse{name=Ellipse, upperLeftOfRectangle=Point{name=A, x=3.0, y=4.0}, height=5.0, width=10.0}",
                "Line{name=Line, point1=Point{name=Point1, x=10.0, y=20.0}, point2=Point{name=Point2, x=12.0, y=22.0}}",
                "Point{name=Point, x=100.0, y=200.0}",
                "Rectangle{name=Rectangle, leftTop=Point{name=ULC, x=10.0, y=20.0}, righBottom=Point{name=BRC, x=100.0, y=230.0}}",
                "Triangle{name=Triangle, p1=Point{name=A, x=1.0, y=2.0}, p2=Point{name=B, x=3.0, y=5.0}, p3=Point{name=C, x=6.0, y=7.0}}",
        };

        System.out.println("Shapes array show:\n");

        for (Shape shape : shapes) {
            shape.show();
        }

        System.out.println("\nExpected shapes shows:\n");

        for (String string : expectShapesOut) {
            System.out.println((string));
        }


        if (shapes.length == expectShapesOut.length){
            for (int i = 0; i < expectShapesOut.length; i++) {
                if(!expectShapesOut[i].equals(shapes[i].toString())){
                    System.out.println("\nRESULT: Shapes array element NUM:" + i + " with name: "+shapes[i].getName() + " incorrect!!!"  );
                    isArraysShowCorrect = false;
                    break;
                }

            }
            System.out.println("\nRESULT: Shapes array correct!!!");

        } else {
            isArraysShowCorrect = false;
            System.out.println("\nRESULT: Shapes array length incorrect!!!");
        }


        Assert.assertTrue(isArraysShowCorrect);
    }
}