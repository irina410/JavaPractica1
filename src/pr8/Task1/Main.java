package pr8.Task1;

public class Main {
    public static void main(String[] args) {
        // Задача 1: Треугольная последовательность
        int n1 = 7;  // Задаем значение n, для которого нужно вывести первые n членов последовательности
        int current = 1;  // Текущее число, начиная с 1

        System.out.println("Задача 1: Треугольная последовательность");
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(current + " ");  // Выводим текущее число
                current++;  // Увеличиваем текущее число на 1
            }
        }
        System.out.println("\n");
    }
}
