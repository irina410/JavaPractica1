package pr7.Task4;

public class Main {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        double result1 = mc1.power(2, 3); // 2^3 = 8
        double result2 = mc1.modulus(3, 4); // |3 + 4i| = 5
        double circumference = 2 * mc1.PI * 5; // длина окружности с радиусом 5
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Circumference: " + circumference);
    }
}