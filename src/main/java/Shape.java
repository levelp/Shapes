/**
 * Фигура
 */
public abstract class Shape {
    protected final String name;

    /**
     * Конструктор класса Shape
     *
     * @param name имя фигуры
     */
    public Shape(String name) {
        this.name = name;
    }

    /**
     * Имя фигуры и все параметры
     */
    public void show() {
        System.out.println(toString());
    }

    @Override
    abstract public String toString();
}
