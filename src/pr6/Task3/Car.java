package pr6.Task3;

class Car implements Nameable {
    private String brand; // поле для хранения марки автомобиля
    private String model; // поле для хранения модели автомобиля

    public Car(String brand, String model) { // конструктор класса
        this.brand = brand;
        this.model = model;
    }

    public String getName() { // реализация метода getName
        return brand + " " + model;
    }
}