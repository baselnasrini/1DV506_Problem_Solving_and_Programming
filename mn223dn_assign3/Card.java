package mn223dn_assign3;


public class Card {
	public enum Rank { ACE, TWO, THREE, FOUR, FIVE, SIX,
        SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}
	
	public enum Suit { CLUBS, DIAMONDS, HEARTS, SPADES }
	
	public Rank rank;
	public Suit suit;
	public Card (Rank rank , Suit suit){
		this.rank=rank;
		this.suit=suit;
	}
	
	
	public Rank rank() { return rank;}
	public Suit suit() { return suit;}
	public String toString() {return rank +" of "+ suit; }
	

	}

