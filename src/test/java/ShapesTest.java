import org.junit.Test;

/**
 * Тестирование работы с нескольникими фигурами
 */
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
        // Треугольник
        Triangle triangle = new Triangle("Triangle",
                new Point("A", 1, 2),
                new Point("B", 4, 5),
                new Point("C", 6, 7)
        );

        //круг
        Circle circle = new Circle("Circle", new Point("center",5,5), 8);

        //конус
        Romb romb = new Romb("Romb",new Point("center",0,0),2,4);

        Shape[] shapes = {
                triangle,
                new Point("Point", 1, 2),
                new Rectangle("Rectangle",
                        new Point("left top", 10, 20),
                        new Point("right bottom", 100, 10)
                ),
                circle,
                romb
        };

        for (Shape shape : shapes) {
            shape.show();
        }

        //площадь ромба
        // assertEquals();
        System.out.println("area: "+ romb.area());
    }
}
