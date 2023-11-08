package pr9.Task3;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    // Метод для слияния двух списков
    public static List<Student> merge(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).compareTo(list2.get(j)) < 0) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    // Метод для сортировки слиянием
    public static List<Student> mergeSort(List<Student> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;
        List<Student> left = list.subList(0, mid);
        List<Student> right = list.subList(mid, list.size());

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    public static void main(String[] args) {
        // Пример данных о студентах
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("John", 20));
        list1.add(new Student("Jane", 22));
        list1.add(new Student("Bob", 19));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Alice", 21));
        list2.add(new Student("Charlie", 18));

        // Объединяем и сортируем
        List<Student> mergedList = mergeSort(merge(list1, list2));

        // Выводим результат
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}