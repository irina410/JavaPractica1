package pr8.Task6;
//Задание 6 Проверка числа на простоту
public class Main {
    public static void main(String[] args) {
        int n = 17; // заданное число
        if (isPrime(n, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    /**
     * Метод проверяет, является ли число простым
     *
     * @param n число, которое нужно проверить
     * @param i делитель числа n
     * @return true, если число простое, false - в противном случае
     */
    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);
    }
}