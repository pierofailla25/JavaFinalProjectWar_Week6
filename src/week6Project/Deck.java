package week6Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

	boolean isOriginal = true;

	int counter = 0;

	int selectedIndex;

	Random rand = new Random();



	List<Integer> unshuffledHand = new ArrayList<Integer>();

	List<Integer> shuffledHand = new ArrayList<Integer>();

	List<Integer> shuffledCardsList = new ArrayList<Integer>();



	public List<Integer> shuffle() {

		for(int i = 0; i < 52; i++) {

			unshuffledHand.add(i);

		}

		

		while(shuffledHand.size() != 52){

			int j2 = 0;

			selectedIndex = rand.nextInt(52);

			if(shuffledCardsList.size() > 0) {

				for(int j = counter; j < shuffledCardsList.size(); j++){

					if(j == 0){

						isOriginal = true;

					}

	

					if(shuffledCardsList.get(j) == selectedIndex){	

						isOriginal = false;

					}

					j2 = j;

				}

				

			}

			

			

			

			else if(shuffledCardsList.size() == 0) {

				shuffledHand.add(selectedIndex);

				shuffledCardsList.add(selectedIndex);

				counter++;

				

			}

			

			if(isOriginal && j2 != 51){

				shuffledHand.add(selectedIndex);

				shuffledCardsList.add(selectedIndex);

				counter++;

			}

			

			

		}



		

		

		return shuffledCardsList;

	}

	

	Integer returnable;

	public Integer draw() {

		if(!shuffledCardsList.isEmpty()) {

			returnable = shuffledCardsList.get(0);

			shuffledCardsList.remove(0);

			return(returnable);

		}

		

		else {

			System.out.println("no more cards");

			

			//represents null

			return -1;

		}

	}

}


	
	
	
	
	
	
	
	
	
	
	
