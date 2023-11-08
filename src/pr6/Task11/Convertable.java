package pr6.Task11;

// Интерфейс для конвертации температур
interface Convertable {
    double convertToKelvin(double celsius);    // Метод для конвертации в Кельвины
    double convertToFahrenheit(double celsius); // Метод для конвертации в Фаренгейты
}