package pr8.Task15;
//Задание 15 Цифры числа справа налево
public class DigitsFromRightToLeft {
    public static void main(String[] args) {
        int number = 12345;
        printDigitsFromRightToLeft(number);
    }

    public static void printDigitsFromRightToLeft(int n) {
        if (n < 10) {
            // Базовый случай: если число меньше 10, то это одиночная цифра.
            // Выводим ее и завершаем рекурсию.
            System.out.print(n + " ");
        } else {
            // Рекурсивный случай:
            // 1. Находим последнюю цифру числа, вычисляя остаток от деления на 10.
            // 2. Выводим последнюю цифру.
            // 3. Вызываем функцию рекурсивно для остатка числа без последней цифры.
            int lastDigit = n % 10;

            // Рекурсивный вызов для остатка числа без последней цифры.
            printDigitsFromRightToLeft(n / 10);

            System.out.print(lastDigit + " ");
        }
    }
}