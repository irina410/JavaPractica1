package pr4.Task1;

enum Season {
    Весна(10),
    Лето(25),
    Осень(15),
    Зима(-5);

    private int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        if (this == Лето) {
            return "Теплое время года";
        }
        return "Холодное время года";
    }
}