package pokerBase;

import java.util.ArrayList;
import java.util.Collections;

import pokerEnums.eRank;
import pokerEnums.eSuit;
import pokerExceptions.DeckException;

public class Deck {

	private ArrayList<Card> deckCards = new ArrayList<Card>();
	private int cardsUsed;
	private Card[] deck;

	public Deck() {
		int iCardNbr = 1;
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				if (eSuit != pokerEnums.eSuit.JOKER) {
					deckCards.add(new Card(eSuit, eRank, iCardNbr++));
				}
			}
			 
		}
		Collections.shuffle(deckCards);
	}
	
	public Deck(int NbrOfJokers) {
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

		this(NbrOfJokers);
		
		for (Card c : deckCards){
			for (Card wc : Wilds ){
				if ((c.geteRank() == wc.geteRank())&& (c.geteSuit()) == wc.geteSuit())
					c.setbWild(true);
		Collections.shuffle(deckCards);				
						
			}
		}
	}
	
	public int cardsLeft() {
		return deck.length - cardsUsed;
	}
	
	public Card Draw() throws DeckException {
		if (cardsLeft() == 0) {
			throw new DeckException("Deck is Empty");
		}
	return this.deckCards.remove(0);
}
}
