package pr7.Task7_8;


public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[] {
                new Magazine("Журнал 1"),
                new Book("Книга 1"),
                new Magazine("Журнал 2")
        };

        Magazine.printMagazines(printables);
        //Book.printBooks(printables);
    }
}