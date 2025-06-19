package level3;
import java.util.*;

public class CardDeckDistributor {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter total number of cards to distribute (<= 52): ");
	        int n = scanner.nextInt();

	        System.out.print("Enter number of players: ");
	        int x = scanner.nextInt();

	        if (n > 52 || n < x || n % x != 0) {
	            System.out.println("Invalid input: Cannot distribute " + n + " cards evenly among " + x + " players.");
	            return;
	        }

	        String[] deck = initializeDeck();
	        shuffleDeck(deck);
	        String[][] players = distributeCards(deck, n, x);
	        printDistribution(players);
	    }

	 public static String[] initializeDeck() {
	        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
	        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
	                           "Jack", "Queen", "King", "Ace" };

	        int numOfCards = suits.length * ranks.length;
	        String[] deck = new String[numOfCards];
	        int index = 0;

	        for (String suit : suits) {
	            for (String rank : ranks) {
	                deck[index++] = rank + " of " + suit;
	            }
	        }

	        return deck;
	    }
	 
	 public static void shuffleDeck(String[] deck) {
	        int n = deck.length;
	        for (int i = 0; i < n; i++) {
	            int randomCardNumber = i + (int) (Math.random() * (n - i));
	            String temp = deck[i];
	            deck[i] = deck[randomCardNumber];
	            deck[randomCardNumber] = temp;
	        }
	    }
	 
	 
	 public static String[][] distributeCards(String[] deck, int nCards, int players) {
	        if (nCards % players != 0) {
	            System.out.println("Cannot distribute " + nCards + " cards evenly to " + players + " players.");
	            return null;
	        }

	        int cardsPerPlayer = nCards / players;
	        String[][] distribution = new String[players][cardsPerPlayer];

	        int index = 0;
	        for (int i = 0; i < players; i++) {
	            for (int j = 0; j < cardsPerPlayer; j++) {
	                distribution[i][j] = deck[index++];
	            }
	        }

	        return distribution;
	    }
	 public static void printDistribution(String[][] playersCards) {
	        if (playersCards == null) return;

	        for (int i = 0; i < playersCards.length; i++) {
	            System.out.println("\nPlayer " + (i + 1) + " cards:");
	            for (String card : playersCards[i]) {
	                System.out.println(" - " + card);
	            }
	        }
	    }
}
