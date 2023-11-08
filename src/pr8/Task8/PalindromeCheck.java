package pr8.Task8;
//Задание 8. Палиндром
public class PalindromeCheck {
    // Рекурсивная функция для проверки, является ли слово палиндромом
    public static boolean isPalindrome(String word) {
        // Базовый случай: если длина слова меньше или равна 1, оно считается палиндромом
        if (word.length() <= 1) {
            return true;
        }
        // Сравниваем первую и последнюю буквы слова
        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }
        // Рекурсивно проверяем внутреннюю часть слова (без первой и последней буквы)
        return isPalindrome(word.substring(1, word.length() - 1));
    }

    public static void main(String[] args) {
        String word = "racecar"; // Ваше слово
        if (isPalindrome(word)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}