package mn223dn_assign3;

public class PlayCardsMain {

	public static void main(String[] args) {

		Deck deck = new Deck();

		deck.shuffle();

		System.out.println("The deck contains: " + deck.getDeckSize() + " cards.");

		for (int i = 0; i < 2; i++) {
			deck.dealCard(i);
			System.out.println("The dealt card is: " + deck.getDealtCard(i));
			System.out.println("Remain: " + deck.getDeckSize() + " cards.");

		}

		deck.shuffle();

	}

}
