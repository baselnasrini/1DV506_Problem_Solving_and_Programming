package mn223dn_assign3;

import java.util.*;

public class Play123Main {
	public static void shuffle(ArrayList<Card> a) {
		Random rand = new Random();
		for (int i = a.size(); i > 0; i--) {
			swap(a, i - 1, rand.nextInt(i));
		}
	}

	private static void swap(ArrayList<Card> a, int i, int j) {
		Card temp = a.get(i);

		a.set(i, a.get(j));
		a.set(j, temp);
	}

	public static boolean Play123(Deck deck) {
		deck.shuffle();
		ArrayList<Card> a = deck.getDeck();

		int size = deck.getDeckSize();

		int count = 1;

		while (size > 0) {

			if (a.get(0).rank() == Card.Rank.ACE && (count) % 3 == 1) {
				return false;
			}

			else if (a.get(0).rank() == Card.Rank.TWO && (count) % 3 == 2) {

				return false;
			}

			else if (a.get(0).rank() == Card.Rank.THREE && (count) % 3 == 0) {

				return false;

			}
			count++;
			a.remove(0);
			size--;
		}

		return true;

	}

	public static void main(String[] args) {
		int win = 0;

		for (int i = 0; i <= 10000; i++) {
			Deck asd = new Deck();
			if (Play123(asd))
				win++;
		}

		System.out.println(win);

		System.out.println("The probability of winning is: " + ((win * 100.0) / 10000));

	}
}
