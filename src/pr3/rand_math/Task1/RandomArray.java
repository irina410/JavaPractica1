package pr3.rand_math.Task1;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int length = 10; // Длина массива

        // Создание и вывод массива, сгенерированного с помощью метода random() класса Math
        double[] array1 = generateArrayUsingMathRandom(length);
        System.out.println("Массив, сгенерированный с использованием метода random() класса Math:");
        printArray(array1);

        // Сортировка массива
        Arrays.sort(array1);

        // Вывод отсортированного массива
        System.out.println("Отсортированный массив (метод random() класса Math):");
        printArray(array1);


        // Создание и вывод массива, сгенерированного с помощью класса Random
        double[] array2 = generateArrayUsingRandomClass(length);
        System.out.println("Массив, сгенерированный с использованием класса Random:");
        printArray(array2);

        // Сортировка массива
        Arrays.sort(array2);

        // Вывод отсортированного массива
        System.out.println("Отсортированный массив (класс Random):");
        printArray(array2);
    }

    private static double[] generateArrayUsingMathRandom(int length) {
        double[] array = new double[length];

        for (int i = 0; i < length; i++) {
            array[i] = Math.random();
        }

        return array;
    }

    private static double[] generateArrayUsingRandomClass(int length) {
        double[] array = new double[length];

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextDouble();
        }

        return array;
    }

    private static void printArray(double[] array) {
        for (double number : array) {
            System.out.println(number);
        }
        System.out.println();
    }
}