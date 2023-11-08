package pr10.Task2;

class Student {
    private String name;
    private int iDNumber;
    private double GPA;

    public Student(String name, int iDNumber, double GPA) {
        this.name = name;
        this.iDNumber = iDNumber;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public double getGPA() {
        return GPA;
    }
}
