package pr10.Task1;

public class Student {
    // Переменные экземпляра
    private String firstName;   // Имя студента
    private String lastName;    // Фамилия студента
    private String major;       // Специальность студента
    private int course;         // Курс студента
    private String group;       // Группа студента

    // Конструктор класса
    public Student(String firstName, String lastName, String major, int course, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.course = course;
        this.group = group;
    }

    // Геттер для имени студента
    public String getFirstName() {
        return firstName;
    }

    // Сеттер для имени студента
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Геттер для фамилии студента
    public String getLastName() {
        return lastName;
    }

    // Сеттер для фамилии студента
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Геттер для специальности студента
    public String getMajor() {
        return major;
    }

    // Сеттер для специальности студента
    public void setMajor(String major) {
        this.major = major;
    }

    // Геттер для курса студента
    public int getCourse() {
        return course;
    }

    // Сеттер для курса студента
    public void setCourse(int course) {
        this.course = course;
    }

    // Геттер для группы студента
    public String getGroup() {
        return group;
    }

    // Сеттер для группы студента
    public void setGroup(String group) {
        this.group = group;
    }

    // Другие методы класса могут быть добавлены здесь

    public static void main(String[] args) {
        // Пример использования класса Student
        Student student = new Student("Иван", "Иванов", "программная инженерия", 2, "ИКБО-666-22");
        System.out.println("Имя: " + student.getFirstName());
        System.out.println("Фамилия: " + student.getLastName());
        System.out.println("Специальность: " + student.getMajor());
        System.out.println("Курс: " + student.getCourse());
        System.out.println("Группа: " + student.getGroup());
    }
}
