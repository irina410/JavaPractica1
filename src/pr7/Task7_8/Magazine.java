package pr7.Task7_8;

public class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println("Печать журнала: " + title);
    }

    // Статический метод для вывода названий только журналов
    public static void printMagazines(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                // Если текущий объект - журнал, вывести его название
                System.out.println(((Magazine) printable).getTitle());
            }
        }
    }
}
