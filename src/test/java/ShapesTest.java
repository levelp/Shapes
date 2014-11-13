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

        Circle circle = new Circle("Круг",
                new Point("Центр", 3, 3),
                12);

        Line line = new Line("Линия",
                new Point("A", 8, 8),
                new Point("B", 0, 0));

        Rhombus rhombus = new Rhombus("Ромб",
                new Point("Вершина", 15, 30),
                18,
                39);

        Square square = new Square("Квадрат",
                new Point("Врхняя левая вершина", 0, 0),
                10);

        Shape[] shapes = {
                triangle,
                new Point("Просто точка", 1, 2),
                new Rectangle("Прямоугольник",
                    new Point("Левый верхний угол", 10, 20),
                    new Point("Правый нижний угол", 100, 230)),
                circle,
                line,
                rhombus,
                square
        };

        for (Shape shape : shapes) {
            shape.show();
        }
        // assertEquals();
    }
}