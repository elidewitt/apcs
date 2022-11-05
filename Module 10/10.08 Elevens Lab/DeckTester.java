/**
 * This is a class that tests the Deck class.
 *
 *  Eli R DeWitt
 *  4/4/2022
 * 
 * 
 * PMR: This was an interesting lab! I used loops to create the deck of 52 at the end
 * but I think there might be a mistake somewhere. When the code is ran, it seems to only
 * print every other card in the deck.
 * 
 * 
 */

public class DeckTester
{
   /**
    * The main method in this class checks the Deck operations for consistency.
    * @param args is not usemyDeck.
    */
   public static void main(String[] args)
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      /* Uncomment blocks of code to test the Deck class */

      String[] r = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};
      String[] s = {"spades", "hearts", "diamonds", "clubs"};
      int [] pv = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

      String[] myRanks = new String[52];
      String[] mySuits = new String[52];
      int[] myPointValues = new int[52];

      int index = 0;
      for (String suit : s) {
         for (int i = 0; i < r.length; i++) {
            myRanks[index] = r[i];
            mySuits[index] = suit;
            myPointValues[index] = pv[i];
            index ++;
         }
      }

      Deck myDeck = new Deck(myRanks, mySuits, myPointValues);


      System.out.println("**** Original Deck Methods ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();

      System.out.println("**** Deck Methods After 1 Card Dealt ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal Remaining 5 Cards ****");

      int size = myDeck.size();
      for (int i = 0; i < size; i++) {
         System.out.println(" deal: " + myDeck.deal());
      }
      System.out.println();
      System.out.println();

      System.out.println("**** Deck Methods After All Cards Dealt ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card From Empty Deck ****");
      System.out.println(" deal: " + myDeck.deal());
      System.out.println();
      System.out.println();

      /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */

      // System.out.println("\n**** 52 Card Deck shuffle Tests ****");
      // String[] ranks52 = {"ace"};
      // String[] suits52 = {"spades"};
      // int[] pointValues52 = {1};

      // System.out.println("  The Starting Deck ");

      // System.out.println("  The Deck After Dealing a Card" );

      // System.out.println("  Shuffleing the Deck ");


   }
}
