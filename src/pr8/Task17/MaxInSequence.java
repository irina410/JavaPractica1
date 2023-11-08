package pr8.Task17;

import java.util.Scanner;
//Задание 17 Максимум последовательности
public class MaxInSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = findMaxInSequence(scanner);
        System.out.println(max);
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
}
