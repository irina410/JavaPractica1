package pr1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива " + ": ");
            array[i] = scanner.nextInt();

        }
        int min = array[0], max = array[0];
        int sum = 0;
        int i = 0;
        do {
            sum += array[i];
            i++;

        } while (i < n);

        System.out.print("сумма элементов целочисленного массива с использованием do-while равна " + sum + "\n");

        sum = 0;
        int whileIndex = 0;
        while (whileIndex < n) {
            sum += array[whileIndex];
            whileIndex++;

        }
        System.out.print("сумма элементов целочисленного массива с использованием while равна " + sum + "\n");

        for (int j = 0; j < n; j++) {
            if (array[j] > max) max = array[j];
            if (array[j] < min) min = array[j];
        }

        System.out.print("Максимальный элемент массива: " + max + "\n");
        System.out.print("Минимальный элемент массива: " + min + "\n");

    }
}
