package pr7.Task4;

public class MathFunc implements MathCalculable {
    public double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    public double modulus(double real, double imaginary) {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary, 2));
    }
}