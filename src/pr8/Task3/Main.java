package pr8.Task3;

public class Main {
    public static void main(String[] args) {
        // Задача 3: От A до B
        int A = 5;  // Задаем значение A
        int B = 10;  // Задаем значение B
        System.out.println("Задача 3: От A до B");
        if (A < B) {
            for (int i = A; i <= B; i++) {
                System.out.print(i + " ");  // Выводим числа от A до B в порядке возрастания
            }
        } else {
            for (int i = A; i >= B; i--) {
                System.out.print(i + " ");  // Выводим числа от A до B в порядке убывания
            }
        }
    }
}
