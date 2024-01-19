package week6Project;

import java.util.Random;

public class App {
	static Deck deck = new Deck();
    static Card card = new Card();
    static Random randPlayer = new Random();
    static Integer AlvinsCard = null;
    static Integer TheodoresCard = null;
    static int AlvinsCardDominance = 0;
    static int TheodresCardDominance = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Created New Deck and Card");

		 Player Alvin = new Player();

		 System.out.println("Alvin Ready");

		 

		 Player Theodore = new Player();

		 System.out.println("Theodore Ready");

		

		

		

		



		deck.shuffle();

		System.out.println("\nSimon is shuffling the deck and observing the game (deck.shuffle)");

		

		

			System.out.println("Alvin proceeds to draw his cards");

			Alvin.draw();

			System.out.println("Theodore proceeds to draw his cards\n");

			Theodore.draw();

		

		

		

		

		

		

			Alvin.describe("Alvin");

			Theodore.describe("Theodore");

			System.out.println("\nChipmunk Brothers Alvin and Theodore playing The classic game of WAR...\n\n");

			for(int i = 0; i < 26; i++) {

			AlvinsCard = Alvin.flip();

			TheodoresCard = Theodore.flip();



			AlvinsCardDominance = Alvin.getCardDominance();

			TheodresCardDominance = Theodore.getCardDominance();

			

			if(AlvinsCardDominance > TheodresCardDominance) {

				System.out.println("Alvin: " + AlvinsCardDominance + " vs. Theodore: " + TheodresCardDominance);

				System.out.println("Point to Alvin\n\n");

				System.out.println("Scores: Alvin: " + Alvin.score + " vs. Theodore: " + Theodore.score );

				Alvin.scoreAdjustment();

			}

			else if(AlvinsCardDominance < TheodresCardDominance) {

				System.out.println("Alvin: " + AlvinsCardDominance + " vs. Theodore: " + TheodresCardDominance);

				System.out.println("Point to Theodore \n\n");

				System.out.println("Scores: Alvin: " + Alvin.score + " vs. Theodore: " + Theodore.score );

				Theodore.scoreAdjustment();

			}
	}

	}	
}	
		
		
		
		
		
		
		
		
		
		



