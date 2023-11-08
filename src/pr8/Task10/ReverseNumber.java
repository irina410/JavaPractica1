package pr8.Task10;
//Задание 10. Разворот числа
public class ReverseNumber {
    // Рекурсивная функция для разворота числа
    public static int reverse(int n, int reversed) {
        // Базовый случай: когда исходное число становится 0, возвращаем развернутое число
        if (n == 0) {
            return reversed;
        }
        // Получаем последнюю цифру числа n
        int lastDigit = n % 10;
        // Добавляем ее к развернутому числу
        reversed = reversed * 10 + lastDigit;
        // Рекурсивно вызываем функцию для оставшейся части числа
        return reverse(n / 10, reversed);
    }

    public static void main(String[] args) {
        int n = 12345; // Ваше число (без нулей)
        int reversed = 0;
        int result = reverse(n, reversed);
        System.out.println(result);
    }
}
