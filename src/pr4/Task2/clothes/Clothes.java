package pr4.Task2.clothes;

public abstract class Clothes {
    protected String size;
    protected double cost;
    protected String color;

    public Clothes(String size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public abstract String getDescription();

    @Override
    public String toString() {
        return "Size: " + size + ", Cost: " + cost + ", Color: " + color;
    }
}