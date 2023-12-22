package Week6FinalProject;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	List<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		String[] cardSuits = {"Club", "Spade", "Heart", "Diamond"};
		String[] cardNames = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		
		for (int i = 0; i < cardSuits.length; i++) {
			int cardVal = 2; //this will reset to two each outer iteration
			for (String name : cardNames) {
				String fullCardName = name + " of " + cardSuits[i];
				this.cards.add(new Card(fullCardName, cardVal));
				cardVal++;
			}
		}
	}
	
	public List<Card> getCards() {
		return this.cards;
	}
	
	public Card draw() {
		int lastIndex = this.cards.size() - 1;
		Card returnCard = this.cards.get(lastIndex);
		this.cards.remove(lastIndex);
		
		return returnCard;
	}
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
}
