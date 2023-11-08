package pr6.Task3;

class Animal implements Nameable {
    private String species; // поле для хранения вид животного
    private String name; // поле для хранения имени животного

    public Animal(String species, String name) { // конструктор класса
        this.species = species;
        this.name = name;
    }

    public String getName() { // реализация метода getName
        return name;
    }
}