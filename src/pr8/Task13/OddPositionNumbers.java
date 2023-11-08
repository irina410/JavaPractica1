package pr8.Task13;

import java.util.Scanner;

// Задание 13 Вывести члены последовательности снечетными номерами
public class OddPositionNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printOddPositionNumbers(scanner);
    }

    // Функция для вывода чисел с нечетными позициями из последовательности
    public static void printOddPositionNumbers(Scanner scanner) {
        int number;
        int position = 1; // Инициализируем позицию

        while (true) {
            number = scanner.nextInt(); // Считываем число с клавиатуры

            if (number == 0) {
                break; // Если считали ноль, завершаем ввод
            }

            if (position % 2 == 1) {
                System.out.println(number); // Выводим число на нечетной позиции
            }

            position++;
        }
    }
}
