package pr9.Task2;

public class Student {
    private String name;
    private double gpa;

    // Конструктор студента
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    // Геттер для имени студента
    public String getName() {
        return name;
    }

    // Геттер для GPA студента
    public double getGpa() {
        return gpa;
    }
}