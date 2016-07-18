1. Explain in your own words the relationship between a deck and a card.

 A Deck is used to hold cards, and can perform some simple operations: shuffling
 and dealing.
 
1. Consider the deck initialized with the statements below. How many cards does the deck contain?
    ```java
     String[] ranks = {"jack", "queen", "king"};
     String[] suits = {"blue", "red"};
     int[] pointValues = {11, 12, 13};
     Deck d = new Deck(ranks, suits, pointValues);
    ```

 I guess only 2 cards since there are only two suits.

1. The game of Twenty-One is played with a deck of 52 cards. Ranks run from ace (highest) down to 2
  (lowest). Suits are spades, hearts, diamonds, and clubs as in many other games. A face card has point
  value 10; an ace has point value 11; point values for 2, …, 10 are 2, …, 10, respectively. Specify the
  contents of the ranks, suits, and pointValues arrays so that the statement
    ```java
    Deck d = new Deck(ranks, suits, pointValues);
    ```
  initializes a deck for a Twenty-One game.

 ```java
 ranks = { "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king",
          "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king",
          "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king",
          "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king" };

 suits = { "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", 
          "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", 
          "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", 
          "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds" };
          
 pointValues = { 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 
                11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 
                11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 
                11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };
```
4. Does the order of elements of the ranks, suits, and pointValues arrays matter? 
  
  Once "shuffle" has been implemented, no.  Until then, the order given is the order that
  the deck will be in.  
  
  
  
