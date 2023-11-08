package pr9.Task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA implements Comparator<Student> {
    // Метод для сравнения двух студентов по их GPA
    @Override
    public int compare(Student student1, Student student2) {
        // Сравниваем GPA студентов в порядке убывания
        if (student1.getGpa() > student2.getGpa()) {
            return -1; // Возвращаем -1, если GPA первого студента больше
        } else if (student1.getGpa() < student2.getGpa()) {
            return 1;  // Возвращаем 1, если GPA второго студента больше
        } else {
            return 0;  // Возвращаем 0, если GPA студентов равны
        }
    }

    // Метод для быстрой сортировки списка студентов
    public void quickSort(List<Student> students, int low, int high) {
        if (low < high) {
            // Находим индекс опорного элемента
            int pivotIndex = partition(students, low, high);

            // Рекурсивно сортируем подсписки слева и справа от опорного элемента
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }

    // Метод для разделения списка студентов на две части
    private int partition(List<Student> students, int low, int high) {
        double pivot = students.get(high).getGpa(); // Опорный элемент
        int i = low - 1; // Индекс меньшего элемента

        for (int j = low; j < high; j++) {
            if (compare(students.get(j), students.get(high)) > 0) {
                i++;
                // Меняем элементы местами
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }

        // Меняем опорный элемент с элементом на позиции (i + 1)
        Student temp = students.get(i + 1);
        students.set(i + 1, students.get(high));
        students.set(high, temp);

        return i + 1;
    }

    public static void main(String[] args) {
        // Пример использования
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.8));
        students.add(new Student("Bob", 3.5));
        students.add(new Student("Charlie", 4.0));

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.size() - 1);

        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getGpa());
        }
    }
}