package pr8.Task5;
//Задание 5 Сумма цифр числа

import java.util.Scanner;

public class Main {

    // Функция для вычисления суммы цифр числа
    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0; // Базовый случай: сумма цифр числа 0 равна 0
        } else {
            return n % 10 + sumOfDigits(n / 10); // Рекурсивный случай: суммируем цифры числа
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число N:");
        int N = scanner.nextInt();

        int result = sumOfDigits(N);
        System.out.println("Сумма цифр числа " + N + ": " + result);
    }

}
