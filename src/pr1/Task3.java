package pr1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива " + ": ");
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        double sr = (double) sum / array.length;

        System.out.print("сумма элементов целочисленного массива равна " + sum + "\n");
        System.out.print("Среднее арифметическое его элементов равно " + sr + "\n");


    }

}
