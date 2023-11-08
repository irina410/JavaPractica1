package pr4.Task2.clothes;

import pr4.Task2.MenClothing;
import pr4.Task2.clothes.Clothes;

public class Tie extends Clothes implements MenClothing {
    public Tie(String size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Dressing a man with a tie");
    }

    @Override
    public String getDescription() {
        return "Tie";
    }
}