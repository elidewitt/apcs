/**
 * @purpose store data relevant to cheesecakes
 *
 * @author Eli R DeWitt
 * @version 1/26/2022
 *
 */
public class CheeseCakeV1
{
    private int myQuantity, myServings, myCreamCheese, myVanilla;
    private double mySugar;
    private String myFlavor;
    
   /**
    * Constructor for objects of type CheeseCakeV1
    * @param flavor
    * @param quantity
    */
    CheeseCakeV1(String flavor,int quantity)
    {
        myFlavor = flavor;
        myQuantity = quantity;
    }

    /**
     * Mutator method to calculate the number of servings
     */
    public void calcTotalServings()
    {
        //******* fill in code for method here - 16 servings per cake ****//
        myServings = 16 * myQuantity;
    }

    /**
     * Mutator method to calculate the Cream Cheese Needed
     */
    public void calcCreamCheese()
    {
        //******* fill in rest of method here - 32 ounces per cake ****//
        myCreamCheese = 32 * myQuantity;
    }

    /**
     * Mutator method to calculate the Vanilla Needed
     */
    public void calcVanilla()
    {
        //******* fill in rest of method here - 1 teaspoon per cake ****//
        myVanilla = myQuantity;
    }

    /**
     * Mutator method to calculate the Sugar Needed
     */
    public void calcSugar()
    {
        //******* fill in rest of method here - 1/3 cup per cake ****//
        mySugar = myQuantity / 3.0;
    }    

    /**
     * Getter method to return the number of cakes (no parameters)
     */
    public int getquantity()
    {
        return myQuantity;
    }

    /**
     * Getter method to return flavor of the cake (no parameters)
     */
    public String getFlavor()
    {
        return myFlavor;
    }

    /**
     * Getter method to return amount of Sugar needed (no parameters)
     */
    public double getSugar()
    {
        return mySugar;
    }

    /**
     * Getter method to return amount of Cream Cheese needed (no parameters)
     */
    public int getCreamCheese()
    {
        return myCreamCheese;
    }

    /**
     * Getter method to return amount of Vanilla needed (no parameters)
     */
    public int getVanilla()
    {
        return myVanilla;
    }

    /**
     * Getter method to return number of Servings (no parameters)
     */
    public int getServings()
    {
        return myServings;
    }
    
    public String toString()
    {
        //******* Practice your printf() skills by formatting this data! ****//
        return String.format("%-5s | %-13s | %-9s oz | %-8s | %-4.2f cups | %-4s tbsp |", myQuantity, myFlavor, myCreamCheese, myServings, mySugar, myVanilla);
    }
}