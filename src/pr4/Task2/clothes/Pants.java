package pr4.Task2.clothes;

import pr4.Task2.MenClothing;
import pr4.Task2.WomenClothing;
import pr4.Task2.clothes.Clothes;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(String size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Dressing a man in pants");
    }

    @Override
    public void dressWomen() {
        System.out.println("Dressing a woman in pants");
    }

    @Override
    public String getDescription() {
        return "Pants";
    }
}
