package pr6.Task3;

// Пример использования интерфейса Nameable
public class Main {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth");
        Car bmw = new Car("BMW", "X5");
        Animal cat = new Animal("Cat", "Tom");

        System.out.println("Planet name: " + earth.getName());
        System.out.println("Car name: " + bmw.getName());
        System.out.println("Animal name: " + cat.getName());
    }
}