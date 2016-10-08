package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Deck {

	private ArrayList<Card> deckCards = new ArrayList<Card>();

	public Deck() {
		int iCardNbr = 1;
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				//TODO Lab3 - Fix this
				if (eSuit != eSuit.JOKER) {
					deckCards.add(new Card(eSuit, eRank, iCardNbr++));
				}
			}
			 
		}
		Collections.shuffle(deckCards);
	}
	
	public Deck(int NbrOfJokers) {

		//TODO Lab3 - Implement joker constructor
		this();
		for (int i = 0; i< NbrOfJokers; i++){
			Card c = new Card();
			c.seteRank(eRank.JOKER);
			c.seteSuit(eSuit.JOKER);
			deckCards.add(c);
		Collections.shuffle(deckCards);
		}
	}
	
	
	public Deck(int NbrOfJokers, ArrayList<Card> Wilds) {

		//TODO Lab3 - Implement joker and wild constructor
		this(NbrOfJokers);
		
		for (Card c : deckCards){
			for (Card wc : Wilds ){
				if ((c.geteRank() == wc.geteRank())&& (c.geteSuit()) == wc.geteSuit())
					c.setbWild(true);
		Collections.shuffle(deckCards);				
						
			}
		}
	}
	public Card Draw(){
		//TODO Lab 3 - Implement exception handling for overdraw
		return deckCards.remove(0);
	}
}
