/**
 * This is a class that tests the Card class.
 */
public class CardTester {
	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		//card 1
		Card one = new Card("ace", "spades", 1);
		System.out.println(one.suit());
		System.out.println(one.rank());
		System.out.println(one.pointValue());
		
		//card 2
		Card two = new Card("ace", "spades", 1);
		System.out.println(two.suit());
		System.out.println(two.rank());
		System.out.println(two.pointValue());
		System.out.println("Card 1 matches Card 2: " + one.matches(two));
		assert one.pointValue() == 1 : "Card one value incorrect";

		//card 3
		Card three = new Card("GnR", "hearts", 1);
		System.out.println(two.suit());
		System.out.println(two.rank());
		System.out.println(two.pointValue());
		System.out.println("Card 1 matches Card 2: " + one.matches(three));
		assert one.matches(two) : "Cards don't match";
	}
}