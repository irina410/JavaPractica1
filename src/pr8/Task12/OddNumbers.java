package pr8.Task12;

import java.util.Scanner;

//Задание 12 Вывести нечетные числа последовательности
public class OddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printOddNumbers(scanner);
    }

    // Функция для вывода нечетных чисел из последовательности
    public static void printOddNumbers(Scanner scanner) {
        int number;
        while (true) {
            number = scanner.nextInt(); // Считываем число с клавиатуры

            if (number == 0) {
                break; // Если считали ноль, завершаем ввод
            }

            if (number % 2 == 1) {
                System.out.println(number); // Выводим нечетное число
            }
        }
    }
}