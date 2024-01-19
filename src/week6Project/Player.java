package week6Project;

import java.util.ArrayList;
import java.util.List;

public class Player {
	App appClassReference = new App();
	Card cardClassReference = new Card();
	Deck deckClassReference = new Deck();
	List<Integer> hand = new ArrayList<Integer>();
	Integer score = 0;
	String name = "";
	private Integer cardFlip;

	public void describe(String player) {
		System.out.println(player + " " + hand);
	}
	
	public void draw() {
		for(int i = 0; i < 26; i++) {
			hand.add(appClassReference.deck.draw());  
		}
	}
	
	public Integer flip() {
		if(!hand.isEmpty()) {
			cardFlip = hand.get(0);
			hand.remove(0);
		}
		return cardFlip;
	}
	
	public int getCardDominance() {
		
		return (cardFlip + 1)%13;
		}
	
	public void scoreAdjustment() {
		score += 1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
