package pr8.Task16;

import java.util.Scanner;
//Задание 16 "Количество элементов, равных максимуму":
public class MaxCountInSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = findMaxInSequence(scanner);
        int count = countMaxInSequence(scanner, max);
        System.out.println(count);
    }

    public static int findMaxInSequence(Scanner scanner) {
        int max = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int countMaxInSequence(Scanner scanner, int max) {
        int count = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num == max) {
                count++;
            }
        }
        return count;
    }
}