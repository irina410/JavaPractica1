package pr6.Task4;

public class Car implements Priceable{
    private String make;
    private double price;

    public Car(String make, double price) {
        this.make = make;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getMake() {
        return make;
    }
}
