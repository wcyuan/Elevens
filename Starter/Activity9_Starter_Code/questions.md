1. The size of the board is one of the differences between Elevens and Thirteens. Why is size not an
abstract method?

 The program keeps track of the size of the board in cards.size().  The sub
 class sets this by passing it into the constructor.  After that, the subclass
 never cares about the size of the board, so it's not necessary to make it
 accessible with an abstract method.  Any need for it is covered by cardIndexes
 method.

2. Why are there no abstract methods dealing with the selection of the cards to be removed or replaced
in the array cards?

 The logic for actually selecting the cards is in the GUI, so that is outside of
 Board entirely.  The cards that are selected are passed to isLegal, which is 
 the only method of the subclass that cares about it.

3. Another way to create “IS-A” relationships is by implementing interfaces. Suppose that instead of
creating an abstract Board class, we created the following Board interface, and had
ElevensBoard implement it. Would this new scheme allow the Elevens GUI to call isLegal
and anotherPlayIsPossible polymorphically? Would this alternate design work as well as
the abstract Board class design? Why or why not?
 ```java
 public interface Board
 {
 boolean isLegal(List<Integer> selectedCards);
 boolean anotherPlayIsPossible();
 }
 ``` 
 
Yes, isLegal and anotherPlayIsPossible would still be called polymorphically.
The down-side is that other Boards couldn't share as much logic, they wouldn't
get to share the logic that is in Board.java.  If different boards were more
different and didn't need that shared logic, then the design using an interface
would be better.

