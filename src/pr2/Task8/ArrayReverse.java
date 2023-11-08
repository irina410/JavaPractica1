package pr2.Task8;

import java.util.Arrays;

public class ArrayReverse {
    public static void reverseArray(String[] arr) {
        if (arr == null) {
            return;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Hello", "World", "Good", "Morning"};

        System.out.println("Original array: " + Arrays.toString(arr));

        reverseArray(arr);

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}