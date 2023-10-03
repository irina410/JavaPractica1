package pr2.Task9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Количество игроков должно быть больше 0.");
            return;
        }

        List<String> deck = createDeck();
        shuffleDeck(deck);

        for (int i = 0; i < n; i++) {
            List<String> hand = dealCards(deck, 5);
            System.out.println("Карты " + (i + 1) + "-го игрока: ");
            for (String card : hand) {
                System.out.println(card);
            }
            System.out.println();
        }
    }

    private static List<String> createDeck() {
        List<String> deck = new ArrayList<>();

        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"♠", "♥", "♦", "♣"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + suit);
            }
        }

        return deck;
    }

    private static void shuffleDeck(List<String> deck) {
        Collections.shuffle(deck);
    }

    private static List<String> dealCards(List<String> deck, int numCards) {
        List<String> hand = new ArrayList<>();

        for (int i = 0; i < numCards; i++) {
            if (deck.isEmpty()) {
                System.out.println("В колоде больше нет карт.");
                break;
            }

            hand.add(deck.remove(0));
        }

        return hand;
    }
}