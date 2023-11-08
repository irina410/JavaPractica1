package pr7.Task6;

import pr7.Task5.StringCalculable;

public class Main {
    public static void main(String[] args) {
        StringCalculable sc1 = new ProcessStrings();
        int charCount = sc1.countChars("Hello, world!"); // подсчет символов в строке
        String oddCharString = sc1.oddChars("Hello, world!"); // получение строки, состоящей из символов на нечетных позициях
        String reversedString = sc1.reverse("Hello, world!"); // инвертирование строки
        System.out.println("Char count: " + charCount);
        System.out.println("Odd chars: " + oddCharString);
        System.out.println("Reversed string: " + reversedString);
    }
}