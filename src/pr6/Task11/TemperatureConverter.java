package pr6.Task11;

// Класс, реализующий интерфейс Convertable
class TemperatureConverter implements Convertable {
    @Override
    public double convertToKelvin(double celsius) {
        // Формула для конвертации из градусов Цельсия в Кельвины
        return celsius + 273.15;
    }

    @Override
    public double convertToFahrenheit(double celsius) {
        // Формула для конвертации из градусов Цельсия в Фаренгейты
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        double celsius = 25.0; // Температура в градусах Цельсия

        double kelvin = converter.convertToKelvin(celsius);
        double fahrenheit = converter.convertToFahrenheit(celsius);

        System.out.println("Температура в Кельвинах: " + kelvin);
        System.out.println("Температура в Фаренгейтах: " + fahrenheit);
    }
}
