 1. Discuss the similarities and differences between Elevens, Thirteens, and Tens.

They are all solitaire games where you deal out a board face-up, and look for
pairs of cards that add up to some number.  In all, the goal is to get rid
of all the cards.  

 2. As discussed previously, all of the instance variables are declared in the Board class. But it is the
ElevensBoard class that “knows” the board size, and the ranks, suits, and point values of the
cards in the deck. How do the Board instance variables get initialized with the ElevensBoard
values? What is the exact mechanism?

The ElevensBoard constructor will call the super class constructor.

 3. Now examine the files Board.java, and ElevensBoard.java, found in the Activity8
Starter Code directory. Identify the abstract methods in Board.java. See how these
methods are implemented in ElevensBoard. Do they cover all the differences between Elevens,
Thirteens, and Tens as discussed in question 1? Why or why not?

