package pr1;

import java.math.BigInteger;
import java.util.Scanner;

public class Task7 {

    public static BigInteger factorial(BigInteger n){
        if (n.equals(BigInteger.ZERO))
            return BigInteger.ONE;

        BigInteger factorial = BigInteger.ONE;

        for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)){
            factorial = factorial.multiply(i);
        }

        return factorial;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int n = scanner.nextInt();

        if(n<0) System.out.print("Нужно положительное число");
        else System.out.print("Факториал числа "+n+" равен "+ factorial(BigInteger.valueOf(n)));

    }
}
