import java.util.Scanner;

public class Task7 {

    public static long factorial(int n){
        if (n==0)return 1;
        long factorial = 1;

        for (int i=1;i<=n;i++){factorial*=i;}

        return factorial;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int n = scanner.nextInt();

        if(n<0) System.out.print("Нужно положительное число");
        else System.out.print("Факториал числа "+n+" равен "+ factorial(n));

    }
}
