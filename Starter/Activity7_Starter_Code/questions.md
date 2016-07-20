Questions:

1. What items would be necessary if you were playing a game of Elevens at your desk (not on the
computer)? List the private instance variables needed for the ElevensBoard class.

 - A deck of cards.  A table, or some surface on which to put the board.
 - A place to put pairs you have found (that have been removed from the board).

2. Write an algorithm that describes the actions necessary to play the Elevens game.

 - Deal 9 cards.
 - While there are cards on the table:
  - Find a possible set to remove
   - Look at all pairs of cards and see if it is a valid pair to remove
   - Look to see if there is a J/Q/K set to remove
  - If not, you lost.
  - If so, remove the set from the table.
  - Deal cards until there are 9 cards on the table or there are no cards left in the deck.


3. Now examine the partially implemented ElevensBoard.java file found in the Activity7
Starter Code directory. Does the ElevensBoard class contain all the state and behavior
necessary to play the game?

 It looks like it will once the methods have all been implemented

4. ElevensBoard.java contains three helper methods. These helper methods are private
because they are only called from the ElevensBoard class.
 a. Where is the dealMyCards method called in ElevensBoard?
 
  In the constructor and in newGame. 
 
 b. Which public methods should call the containsPairSum11 and containsJQK
methods?

  anotherPlayIsPossible
  isLegal

 c. It’s important to understand how the cardIndexes method works, and how the list that it
returns is used. Suppose that cards contains the elements shown below. Trace the execution
of the cardIndexes method to determine what list will be returned. Complete the diagram
below by filling in the elements of the returned list, and by showing how those values index
cards. Note that the returned list may have less than 9 elements.

 cards -> J♥ 6♣ null 2♠ null null A♠ 4♥ null
 
  returned list -> J♥ 6♣ 2♠ A♠ 4♥

 d. Complete the following printCards method to print all of the elements of cards that are indexed by cIndexes.
 ```java
   public static printCards(ElevensBoard board) {
     List<Integer> cIndexes = board.cardIndexes();
     /* Your code goes here. */
   }
```

 ```java
   public static printCards(ElevensBoard board) {
     List<Integer> cIndexes = board.cardIndexes();
     /* Your code goes here. */
     for (int idx : cIndexes) {
       System.out.println(cards[idx]);
     }
   }
 ```

 e. Which one of the methods that you identified in question 4b above needs to call the
cardIndexes method before calling the containsPairSum11 and containsJQK
methods? Why?

 anotherPlayIsPossible because it is ready from cards, which might have nulls
 if it's the end of the deck.
 
 


