package pr10.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMergeSort {
    public static void main(String[] args) {
        // Создаем два списка данных о студентах
        List<Student> firstList = new ArrayList<>();
        List<Student> secondList = new ArrayList<>();

        // Заполняем первый список
        firstList.add(new Student("Иван", "Иванов", 25));
        firstList.add(new Student("Петр", "Петров", 22));

        // Заполняем второй список
        secondList.add(new Student("Мария", "Сидорова", 21));
        secondList.add(new Student("Анна", "Козлова", 24));

        // Объединяем два списка
        List<Student> mergedList = new ArrayList<>();
        mergedList.addAll(firstList);
        mergedList.addAll(secondList);

        // Сортируем объединенный список по имени
        Collections.sort(mergedList, (s1, s2) -> s1.getFirstName().compareTo(s2.getFirstName()));

        // Выводим отсортированный список
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}
