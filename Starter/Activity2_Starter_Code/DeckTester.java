package Activity2_Starter_Code;

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
		Deck empty = new Deck(new String[]{}, new String[]{}, new int[]{});
		System.out.println("empty.isEmpty() = " + empty.isEmpty());
		System.out.println("empty.size() = " + empty.size());
		System.out.println("empty.deal() = " + empty.deal());

		Deck one = new Deck(new String[]{"six"}, new String[]{"hearts"}, new int[]{6});
		System.out.println("one.isEmpty() = " + one.isEmpty());
		System.out.println("one.size() = " + one.size());
		System.out.println("one.deal() = " + one.deal());
		System.out.println("one.size() = " + one.size());

		Deck three = new Deck(new String[]{"six", "ace", "jack"}, new String[]{"hearts", "spades", "clubs"}, new int[]{6, 1, 11});
		System.out.println("three.isEmpty() = " + three.isEmpty());
		System.out.println("three.size() = " + three.size());
		System.out.println("three.deal() = " + three.deal());
		System.out.println("three.size() = " + three.size());
}
}
