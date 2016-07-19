package Activity3_Starter_Code;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.print(" " + arePermutations(values1, values2));
			System.out.println();
		}
		System.out.println();

		for (int ii = 0; ii < 4; ii++) {
			System.out.println(flip());
		}
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int[] shuffled = new int[values.length];
		int k = 0;
		for (int j = 0; j < (values.length + 1) / 2; j++) {
			shuffled[k] = values[j];
			k += 2;
		}
		k = 1;
		for (int j = (values.length + 1) / 2; j < values.length; j++) {
			shuffled[k] = values[j];
			k += 2;
		}
		for (int j = 0; j < values.length; j++) {
			values[j] = shuffled[j];
		}
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		for (int k = values.length-1; k >= 1; k--) {
			int r = (int)(Math.random() * values.length);
			int temp = values[k];
			values[k] = values[r];
			values[r] = temp;
		}
	}

	/**
	 * Write a static method named flip that simulates a flip of a weighted coin by returning either
	 * "heads" or "tails" each time it is called. The coin is twice as likely to turn up heads as tails.
	 * Thus, flip should return "heads" about twice as often as it returns "tails."
	 * @return
	 */
	public static String flip() {
		int r = (int)(Math.random() * 3);
		if (r == 0) {
			return "tails";
		} else {
			return "heads";
		}
	}


	/*
	 * Write a static method named arePermutations that, given two int arrays of the same length
	 * but with no duplicate elements, returns true if one array is a permutation of the other (i.e., the
	 * arrays differ only in how their contents are arranged). Otherwise, it should return false.
	 * 
	 * Here's a simple N^2 implementation that relies on there being no duplicates.  It'd be better to just
	 * sort both arrays and then check if the result is equal.
	 */
	public static boolean arePermutations(int[] first, int[] second) {
		if (first.length != second.length) {
			return false;
		}
		for (int ii = 0; ii < first.length; ii++) {
			boolean found = false;
			for (int jj = 0; jj < second.length; jj++) {
				if (first[ii] == second[jj]) {
					found = true;
					break;
				}
			}
			if (!found) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 3. Suppose that the initial contents of the values array in Shuffler.java are {1, 2, 3,
	 * 4}. For what sequence of random integers would the efficient selection shuffle change values to
     * contain {4, 3, 2, 1}?
     * 
     * 0, 1, 1, 0
     * 
	 */
}
