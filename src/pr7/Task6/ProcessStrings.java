package pr7.Task6;

import pr7.Task5.StringCalculable;

public class ProcessStrings implements StringCalculable {
    @Override
    public int countChars(String s) {
        return s.length();
    }

    @Override
    public String oddChars(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String reverse(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}

