package pr4.Task2;

import pr4.Task2.clothes.*;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothesArray = {
                new TShirt("M", 20.99, "Black"),
                new Pants("L", 39.99, "Blue"),
                new Skirt("S", 29.99, "Red"),
                new Tie("M", 15.99, "Green")
        };

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothesArray);
        System.out.println();
        atelier.dressMan(clothesArray);
    }
}