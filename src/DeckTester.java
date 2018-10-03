/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		//Deck 1
		System.out.println("-------Deck One Tests-------");

		String[] oneRanks = {"one", "two", "three"};
		String[] suits1 = {"blue", "yellow", "red"};
		int [] points1 = {1, 2, 3, 10, 11};
		Deck one = new Deck(oneRanks, suits1, points1);
		System.out.println("Deck1 size: " + one.size());
		System.out.println("Deck1 toString: ");
		System.out.println(one);
		System.out.println("Deck1 isEmpty: " + one.isEmpty());
		
		//Deck 2
		System.out.println("-------Deck Two Tests-------");
		String[] twoRanks = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "Jack", "queen", "king"};
		String[] suits2 = {"spades", "hearts", "clubs", "diamonds"};
		int [] points2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck two = new Deck(twoRanks, suits2, points2);
		System.out.println("Deck2 size: " + two.size());
		System.out.println("Deckw toString: ");
		System.out.println(two);
		System.out.println("Deck2 isEmpty: " + two.isEmpty());
		
		//Deck 3
		System.out.println("-------Deck Three Tests-------");
		Deck three = new Deck(twoRanks, suits2, points2);
		System.out.println("Deck 3 isEmpty: " + three.isEmpty());
		while(!three.isEmpty()) {
			System.out.println(three.deal());
		}
		System.out.println("Deck 3 isEmpty: " + three.isEmpty());

		
	}
}
