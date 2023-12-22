package Week6FinalProject;

import java.util.List;
import java.util.ArrayList;

public class Player {
	private List<Card> hand = new ArrayList<Card>();
	private int score = 0;
	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println("Player: " + name);
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		int lastIndex = this.hand.size() - 1;
		Card returnCard = this.hand.get(lastIndex);
		this.hand.remove(lastIndex);
		
		return returnCard;
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		this.score++;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.score;
	}
}
