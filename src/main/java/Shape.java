public abstract class Shape {
    protected final String name;

    public String getName() {
        return name;
    }

    public Shape(String name) {
        this.name = name;
    }

    abstract void show();
}
