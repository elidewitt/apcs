/**
 * This is a class that tests the Card class.
 *
 *  Eli R DeWitt
 *  4/4/2022
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("hearts", "ace", 1);
      Card kingSpades = new Card("spades", "king", 13);
      Card queenDiamonds = new Card("diamonds", "queen", 12);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2

      System.out.println("**** Tests Card 2: king of spades ****");
      System.out.println("  rank: " + kingSpades.rank());
      System.out.println("  suit: " + kingSpades.suit());
      System.out.println("  pointValue: " + kingSpades.pointValue());
      System.out.println("  toString: " + kingSpades.toString());
      System.out.println();

      // Test card 3

      System.out.println("**** Tests Card 3: queen of diamonds ****");
      System.out.println("  rank: " + queenDiamonds.rank());
      System.out.println("  suit: " + queenDiamonds.suit());
      System.out.println("  pointValue: " + queenDiamonds.pointValue());
      System.out.println("  toString: " + queenDiamonds.toString());
      System.out.println();
      
      // Test matches() method
      System.out.println("Matches test"); 
      System.out.println(aceHearts + " matches " + aceHearts + ": " + aceHearts.matches(aceHearts)); 
      System.out.println(kingSpades + " matches " + aceHearts + ": " + kingSpades.matches(aceHearts)); 
      System.out.println(queenDiamonds + " matches " + queenDiamonds + ": " + queenDiamonds.matches(queenDiamonds)); 
      System.out.println(queenDiamonds + " matches " + aceHearts + ": " + queenDiamonds.matches(aceHearts)); 
      System.out.println(kingSpades + " matches " + queenDiamonds + ": " + kingSpades.matches(queenDiamonds)); 

   }
}
