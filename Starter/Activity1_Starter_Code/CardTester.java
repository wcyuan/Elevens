package Activity1_Starter_Code;

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

		Card six_of_hearts = new Card("six", "hearts", 6);
		System.out.println("6H rank = " + six_of_hearts.rank());
		System.out.println("6H suit = " + six_of_hearts.suit());
		System.out.println("6H points = " + six_of_hearts.pointValue());
		System.out.println("6H toString = " + six_of_hearts);

		Card jack_of_spades = new Card("jack", "spades", 11);
		System.out.println("JS rank = " + jack_of_spades.rank());
		System.out.println("JS suit = " + jack_of_spades.suit());
		System.out.println("JS points = " + jack_of_spades.pointValue());
		System.out.println("JS toString = " + jack_of_spades);

		Card ten_of_diamonds = new Card("ten", "diamnds", 10);
		System.out.println("10D rank = " + ten_of_diamonds.rank());
		System.out.println("10D suit = " + ten_of_diamonds.suit());
		System.out.println("10D points = " + ten_of_diamonds.pointValue());
		System.out.println("10D toString = " + ten_of_diamonds);

		Card six_of_hearts2 = new Card("six", "hearts", 6);
		System.out.println("six_of_hearts matches ten_of_diamonds: " + (six_of_hearts.matches(ten_of_diamonds)));
		System.out.println("six_of_hearts matches six_of_hearts2: " + (six_of_hearts.matches(six_of_hearts2)));
	}
}
