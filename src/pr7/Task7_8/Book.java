package pr7.Task7_8;

public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println("Печать книги: " + title);
    }

    // Статический метод для вывода названий только книг
    public static void printBooks(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Book) {
                // Если текущий объект - книга, вывести её название
                System.out.println(((Book) printable).getTitle());
            }
        }
    }
}
