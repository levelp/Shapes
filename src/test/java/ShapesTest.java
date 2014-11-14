import org.junit.Test;

/**
 * Тестирование работы с нескольникими фигурами
 */
public class ShapesTest {

    public static void main (String[] args)
    {

        /**
         * Требуется создать массив фигур.
         * Проинциализировать его разными фигурами.
         * Вызывать метод show() в цикле.
         * Для каждой фигуры нужно выводить её название
         * и все её параметры.
         */

        Shape[] shapes = {
                    new Point("Просто точка", 1, 2),
                    new Rectangle("Прямоугольник",
                            new Point("Левый верхний угол", 10, 20),
                            new Point("Правый нижний угол", 100, 230)

                    ),
                    new Circle("Окружность",
                            new Point("Центр", 10, 5),
                            3),
                    new Triangle("Треугольник 1",
                            new Point("A", 1, 2),
                            new Point("B", 4, 5),
                            new Point("C", 6, 7)
                    )


            };

            for (Shape shape : shapes) {
                shape.show();
            }
            // assertEquals();
        }
}
