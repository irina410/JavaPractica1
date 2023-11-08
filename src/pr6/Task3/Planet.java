package pr6.Task3;

public class Planet implements Nameable{

    private String name; // поле для хранения имени планеты

    public Planet(String name) { // конструктор класса
        this.name = name;
    }

    public String getName() { // реализация метода getName
        return name;
    }
}
