package pr4.Task2;

import pr4.Task2.MenClothing;
import pr4.Task2.WomenClothing;
import pr4.Task2.clothes.Clothes;

class Atelier {
    public void dressWomen(Clothes[] clothesArray) {
        System.out.println("Dressing women:");
        for (Clothes clothes : clothesArray) {
            if (clothes instanceof WomenClothing) {
                WomenClothing womenClothing = (WomenClothing) clothes;
                womenClothing.dressWomen();
                System.out.println(clothes.getDescription() + ": " + clothes);
            }
        }
    }

    public void dressMan(Clothes[] clothesArray) {
        System.out.println("Dressing men:");
        for (Clothes clothes : clothesArray) {
            if (clothes instanceof MenClothing) {
                MenClothing menClothing = (MenClothing) clothes;
                menClothing.dressMan();
                System.out.println(clothes.getDescription() + ": " + clothes);
            }
        }
    }
}