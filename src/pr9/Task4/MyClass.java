package pr9.Task4;

import java.util.Arrays;

// Объявляем класс собственного объекта, который реализует интерфейс Comparable
public class MyClass implements Comparable<MyClass> {

    private int value; // Поле для хранения значения объекта

    // Конструктор для инициализации объекта
    public MyClass(int value) {
        this.value = value;
    }

    // Метод сравнения объектов для сортировки
    @Override
    public int compareTo(MyClass other) {
        // Используем метод compareTo из класса Integer для сравнения значений объектов
        // Возвращаем отрицательное значение, если текущий объект меньше other
        // Положительное значение, если текущий объект больше other
        // И ноль, если объекты равны
        return Integer.compare(this.value, other.value);
    }

    // Метод для получения значения объекта
    public int getValue() {
        return value;
    }

    // Метод для установки значения объекта
    public void setValue(int value) {
        this.value = value;
    }

    // Пример использования сортировки объектов MyClass
    public static void main(String[] args) {
        // Создаем массив объектов MyClass
        MyClass[] array = {
                new MyClass(5),
                new MyClass(2),
                new MyClass(8),
                new MyClass(1)
        };

        // Сортируем массив с использованием метода sort из класса Arrays
        // Для сортировки используется метод compareTo, который мы реализовали в классе MyClass
        Arrays.sort(array);

        // Выводим отсортированный массив на экран
        for (MyClass obj : array) {
            System.out.print(obj.getValue() + " ");
        }
        // Вывод: 1 2 5 8
    }
}