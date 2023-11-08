package pr8.Task11;

import java.util.Scanner;

//Задание 11 Количество единиц
public class CountOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOnes = 0; // Инициализируем счетчик единиц

        while (true) {
            int number = scanner.nextInt(); // Считываем число с клавиатуры

            if (number == 0) {
                int nextNumber = scanner.nextInt(); // Считываем следующее число

                if (nextNumber == 0) {
                    break; // Если два нуля подряд, завершаем ввод
                }
            }

            if (number == 1) {
                countOnes++; // Увеличиваем счетчик, если встретили единицу
            }
        }

        System.out.println("Количество единиц: " + countOnes);
    }
}