package pr10.Task2;

import java.util.ArrayList;
import java.util.Comparator;

class SortingStudentsByGPA {
    private ArrayList<Student> students;

    public SortingStudentsByGPA() {
        students = new ArrayList<>();
    }

    // Метод для добавления студентов в массив
    public void setArray(ArrayList<Student> students) {
        this.students = students;
    }

    // Метод для сортировки студентов по среднему баллу в порядке убывания
    public void quicksort() {
        quicksort(0, students.size() - 1);
    }

    private void quicksort(int low, int high) {
        if (low < high) {
            int pivotIndex = partition(low, high);
            quicksort(low, pivotIndex - 1);
            quicksort(pivotIndex + 1, high);
        }
    }

    private int partition(int low, int high) {
        double pivot = students.get(high).getGPA();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (students.get(j).getGPA() >= pivot) {
                i++;
                swap(i, j);
            }
        }

        swap(i + 1, high);
        return i + 1;
    }

    private void swap(int i, int j) {
        Student temp = students.get(i);
        students.set(i, students.get(j));
        students.set(j, temp);
    }

    // Метод для вывода массива студентов
    public void outArray() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", ID Number: " + student.getIDNumber() + ", GPA: " + student.getGPA());
        }
    }

    // Метод для сортировки студентов по другому полю (по ID номеру)
    public void sortByIdNumber() {
        students.sort(Comparator.comparingInt(Student::getIDNumber));
    }

    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        // Создаем и добавляем студентов в массив
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 101, 3.9));
        students.add(new Student("Bob", 102, 3.7));
        students.add(new Student("Charlie", 103, 4.0));
        students.add(new Student("David", 104, 3.5));

        sorter.setArray(students);

        // Сортируем студентов по среднему баллу
        sorter.quicksort();

        System.out.println("Sorted by GPA (descending):");
        sorter.outArray();

        // Сортируем студентов по ID номеру
        sorter.sortByIdNumber();

        System.out.println("\nSorted by ID Number:");
        sorter.outArray();
    }
}