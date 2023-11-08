package pr4.Task1;

public class Main {
    public static void main(String[] args) {
        Season favoriteSeason = Season.Лето;

        System.out.println("Мое любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature());
        System.out.println("Описание времени года: " + favoriteSeason.getDescription());

        for (Season season : Season.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура: " + season.getAverageTemperature());
            System.out.println("Описание времени года: " + season.getDescription());
        }
    }

    public static void printSeasonInfo(Season season) {
        switch (season) {
            case Лето:
                System.out.println("Я люблю лето");
                break;
            case Весна:
                System.out.println("Я люблю весну");
                break;
            case Осень:
                System.out.println("Я люблю осень");
                break;
            case Зима:
                System.out.println("Я люблю зиму");
                break;
        }
    }
}
