package pr9.Task1;

public class StudentSortTest {
    public static void main(String[] args) {
        // Создаем массив объектов Student
        Student[] students = {
                new Student(123, "John"),
                new Student(456, "Alice"),
                new Student(789, "Bob")
        };

        System.out.println("Before sorting:");
        // Выводим неотсортированный список студентов
        for (Student student : students) {
            System.out.println("ID: " + student.getIDNumber() + ", Name: " + student.getName());
        }

        // Вызываем метод insertSort для сортировки массива студентов
        insertSort(students);

        System.out.println("\nAfter sorting:");
        // Выводим отсортированный список студентов
        for (Student student : students) {
            System.out.println("ID: " + student.getIDNumber() + ", Name: " + student.getName());
        }
    }

    // Метод для выполнения сортировки вставками массива студентов
    public static void insertSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            // Сохраняем текущего студента в переменной
            Student key = students[i];
            int j = i - 1;

            // Перемещаем элементы students[0..i-1], которые больше чем key.getIDNumber(),
            // на одну позицию вперед от их текущей позиции
            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            // Размещаем ключевого студента на его правильной позиции в отсортированном массиве
            students[j + 1] = key;
        }
    }
}