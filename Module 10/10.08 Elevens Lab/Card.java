/**
 * Card.java
 * Card represents a playing card.
 *
 *  Eli R DeWitt
 *  4/4/2022
 */

public class Card {

   private String suit;      // the suit of the card
   private String rank;      // the rank of the card
   private int pointValue;   // the point value of the card

    /**
    * Creates a new Card instance.
    *
    * @param cardRank  a String value
    *                  containing the rank of the card
    * @param cardSuit  a String value
    *                  containing the suit of the card
    * @param cardPointValue an int value
    *                  containing the point value of the card
    */
   public Card(String cardRank, String cardSuit, int cardPointValue)
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
      this.rank = cardRank;
      this.suit = cardSuit;
      this.pointValue = cardPointValue;
   }

   /**
    * Accesses this Card's suit.
    * @return this Card's suit.
    */
    public String suit()
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
      return this.suit;
    }

   /**
    * Accesses this Card's rank.
    * @return this Card's rank.
    */
   public String rank()
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
      return this.rank;
   }

    /**
    * Accesses this Card's point value.
    * @return this Card's point value.
    */
   public int pointValue()
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
      return this.pointValue;
   }

   /** Compare this card with the argument.
    * @param otherCard the other card to compare to this
    * @return true if the rank, suit, and point value of this card
    *              are equal to those of the argument;
    *         false otherwise.
    */
   public boolean matches(Card otherCard)
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
      return otherCard.suit().equals(suit()) && otherCard.rank().equals(rank()) && otherCard.pointValue() == pointValue();
   }

   /**
    * Converts the rank, suit, and point value into a string in the format
    *     "[Rank] of [Suit] (point value = [PointValue])".
    * This provides a useful way of printing the contents
    * of a Deck in an easily readable format or performing
    * other similar functions.
    *
    * @return a String containing the rank, suit,
    *         and point value of the card.
    */
   @Override
   public String toString()
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
      return rank() + " of " + suit() + " (point value = " + pointValue() + ")";
   }
}
