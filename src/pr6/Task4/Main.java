package pr6.Task4;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", 19.99);
        Car car = new Car("Toyota Camry", 25000.0);

        System.out.println("Book: " + book.getTitle() + ", Price: $" + book.getPrice());
        System.out.println("Car: " + car.getMake() + ", Price: $" + car.getPrice());
    }
}
