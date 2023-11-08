package pr6.Task4;

public class Book implements Priceable{
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}
