package pr8.Task14;
//Задание 14 Цифры числа слева направо
public class DigitsFromLeftToRight {
    public static void main(String[] args) {
        int number = 12345;
        printDigitsFromLeftToRight(number);
    }

    public static void printDigitsFromLeftToRight(int n) {
        if (n < 10) {
            // Базовый случай: если число меньше 10, то это одиночная цифра.
            // Выводим ее и завершаем рекурсию.
            System.out.print(n + " ");
        } else {
            // Рекурсивный случай:
            // 1. Разделяем число на две части: последнюю цифру и остаток числа без нее.
            // 2. Выводим последнюю цифру.
            // 3. Вызываем функцию рекурсивно для остатка числа без последней цифры.
            int lastDigit = n % 10;
            int remainingDigits = n / 10;

            System.out.print(lastDigit + " ");

            // Рекурсивный вызов для остатка числа без последней цифры.
            printDigitsFromLeftToRight(remainingDigits);
        }
    }
}
