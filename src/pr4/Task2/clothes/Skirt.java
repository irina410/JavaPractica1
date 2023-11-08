package pr4.Task2.clothes;

import pr4.Task2.WomenClothing;
import pr4.Task2.clothes.Clothes;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(String size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Dressing a woman in a skirt");
    }

    @Override
    public String getDescription() {
        return "Skirt";
    }
}