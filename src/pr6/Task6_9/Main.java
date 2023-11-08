package pr6.Task6_9;

// Task 6: Определение интерфейса pr6.Task6_9.Printable
interface Printable {
    void print();
}

// Task 7: Определение класса pr6.Task6_9.Book, реализующего интерфейс pr6.Task6_9.Printable
class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Книга: " + title);
    }
}

// Task 8: Определение класса pr6.Task6_9.Shop, реализующего интерфейс pr6.Task6_9.Printable
class Shop implements Printable {
    private String name;

    public Shop(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Магазин: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 9: Создание массива типа pr6.Task6_9.Printable и заполнение его объектами
        Printable[] printableItems = new Printable[3];
        printableItems[0] = new Book("Книга 1");
        printableItems[1] = new Book("Книга 2");
        printableItems[2] = new Shop("Магазин ABC");

        // Цикл для вызова метода print() для каждого объекта в массиве
        for (Printable item : printableItems) {
            item.print();
        }
    }
}