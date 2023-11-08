package pr8.Task7;
//Задание 7 Разложение на множители
public class PrimeFactorization {
    // Функция для вывода простых множителей числа n
    public static void primeFactors(int n) {
        // Пока n делится на 2, выводим и сохраняем его простой множитель
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        // n становится нечётным здесь
        // Проверяем простые множители, начиная с 3
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // Пока i делит n, выводим и сохраняем его простой множитель
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // Если n больше 2, то он является простым множителем
        if (n > 2) {
            System.out.print(n);
        }
    }

    public static void main(String[] args) {
        int n = 315; // Ваше натуральное число
        System.out.print("Простые множители числа " + n + " : ");
        primeFactors(n);
    }
}
