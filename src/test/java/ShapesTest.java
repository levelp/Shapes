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
        Triangle triangle = new Triangle("Треугольник 1",
                new Point("A", 1, 2),
                new Point("B", 4, 5),
                new Point("C", 6, 7)
        );
        //Точка
        Point point = new Point ("Точка", 1.0, 2.0);

        //Прямоугольник
        Rectangle rectangle = new Rectangle("Прямоугольник",
                new Point("Левый верхний угол", 10, 20),
                new Point("Правый нижний угол", 100, 230)
        );
        //Круг
        Circle circle = new Circle("Круг",
                new Point("Центр круга", 8, 10),
                25);
        //Квадрат
        Square square = new Square("Квадрат",
                new Point("Левый верхний угол", 2,20), 50);

        Shape[] shapes = {
                triangle,
                point,
                rectangle,
                circle,
                square
        };

        for (Shape shape : shapes) {
            shape.show();
        }
        // assertEquals();
    }
}
