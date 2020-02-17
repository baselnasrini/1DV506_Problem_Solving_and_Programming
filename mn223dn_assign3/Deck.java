package mn223dn_assign3;

import java.util.*;
import mn223dn_assign3.Card.*;

public class Deck {
	
	private  ArrayList <Card> a = new ArrayList<Card>(); 
	
	public Deck(){
		
		 for (Suit suit1 : Suit.values()){
	         for (Rank rank1 : Rank.values()){
	        	 	        	 
	             a.add(new Card(rank1, suit1));
	         }
		 }	 
	}
	
	public ArrayList <Card> getDeck (){
		return a;
		
	}

	public Card getDealtCard(int b){
		return a.get(b);
	}
	
	public void dealCard (int b) {
		
		a.remove(b);
		
	}
	
	public void shuffle() {
		if  (a.size() == 52){
			Random rand = new Random();
			for (int i = a.size(); i > 0; i--) {
				swap(a, i - 1, rand.nextInt(i));
			}
    
		}
		else{
			System.err.println("The Deck is less than 52 cards.");
		}
	}

    public  void swap(ArrayList<Card> a, int i, int j) {
        Card temp = a.get(i);
        
        a.set(i, a.get(j));
	    a.set(j, temp );
    }
	
    public  int getDeckSize(){
    	return a.size();
    }
	

}