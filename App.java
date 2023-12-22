package Week6FinalProject;

public class App {
	public static void main(String[] args) {
		Deck gameDeck = new Deck();
		Player tom = new Player("Tom");
		Player brady = new Player("Brady");
		
		gameDeck.shuffle();
		
		for (int i = 0; i < 52; i++) {
			if ((i % 2) == 0) {
				tom.draw(gameDeck);
			} else {
				brady.draw(gameDeck);
			}
		}
		
		for (int i = 0; i < 26; i++) {
			Card tomsCard = tom.flip();
			Card bradysCard = brady.flip();
			
			System.out.print("Tom: ");
			tomsCard.describe();
			System.out.print("Brady: ");
			bradysCard.describe();
			System.out.println();
			
			if (tomsCard.getValue() > bradysCard.getValue()) {
				System.out.println(tom.getName() + " receives 1 pt.");
				tom.incrementScore();
			} else if (tomsCard.getValue() < bradysCard.getValue()) {
				System.out.println(brady.getName() + " receives 1 pt.");
				brady.incrementScore();
			} else {
				System.out.println("No points awarded.");
			}
			
			
			System.out.println("\n" + tom.getName() + "'s current points: " + tom.getScore());
			System.out.println(brady.getName() + "'s current points: " + brady.getScore());
			System.out.println("----------------------------\n\n");
		}
		
		System.out.println(tom.getName() + "'s score: " + tom.getScore());
		System.out.println(brady.getName() + "'s score: " + brady.getScore());
		
		if (tom.getScore() > brady.getScore()) {
			System.out.println(tom.getName() + " wins!");
		} else if (tom.getScore() < brady.getScore()) {
			System.out.println(brady.getName() + " wins!");
		} else {
			System.out.println("Draw!");
		}
	}
}
