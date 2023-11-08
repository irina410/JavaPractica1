package pr8.Task4;

import java.util.Scanner;

public class Main {

    // Функция для подсчета количества k-значных чисел с заданной суммой цифр
    static int countNumbersWithSum(int k, int s) {
        // Проверка на случаи, когда k равно 1
        if (k == 1) {
            if (s >= 1 && s <= 9) {
                return 1; // Есть только одно k-значное число суммой цифр от 1 до 9
            } else {
                return 0; // Для любой другой суммы цифр нет решений
            }
        }

        // Инициализация переменных для хранения количества решений и текущей цифры
        int count = 0;
        int digit = 1;

        // Начинаем с самой левой цифры (не может быть 0)
        while (digit <= 9) {
            // Если оставшиеся цифры можно представить суммой, вызываем рекурсию
            if (s - digit >= 0) {
                count += countNumbersWithSum(k - 1, s - digit);
            }
            digit++;
        }

        return count;
    }


    public static void main(String[] args) {
        // Задача 4: Заданная сумма цифр
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите k (количество цифр) и s (сумму цифр):");
        int k = scanner.nextInt();
        int s = scanner.nextInt();

        int result = countNumbersWithSum(k, s);
        System.out.println("Количество " + k + "-значных чисел с суммой цифр " + s + ": " + result);
    }
}
