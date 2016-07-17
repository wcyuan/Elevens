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
	}
}
