/**
 * @purpose manipulate and display data and calculated information about cheesecakes
 *
 * @author Eli R DeWitt
 * @version 1/26/2022
 * 
 * @PMR I like the utility in the ArrayList. It'd be nice if you could define it 
 * right away like you can with regular arrays (int[] arr = {4,6,8,1,6}) maybe you
 * can and I'm just unware of how to do that. Adding each element just to initallize
 * the ArrayList seems tedious.
 *
 */
import java.util.ArrayList;

public class CheeseCakeTesterV1
{
    public static void main(String[] args)
    {
        //initializing and declareing an ArrayList and adding in objects as elements
        ArrayList<CheeseCakeV1> cake = new ArrayList<CheeseCakeV1>();
            // add CheeseCake to the ArrayList
        cake.add(new CheeseCakeV1("Blueberry", 5));
        cake.add(new CheeseCakeV1("Strawberry", 6));
        cake.add(new CheeseCakeV1("Cherry", 4));
        cake.add(new CheeseCakeV1("Jalapeno", 1));
        cake.add(new CheeseCakeV1("Dill Pickle", 2));
        cake.add(new CheeseCakeV1("Fig", 3));
        
        //calls several method for each object to perform calculations
        for(CheeseCakeV1 dataRecord : cake)
        {
            dataRecord.calcTotalServings();
            dataRecord.calcCreamCheese();
            dataRecord.calcVanilla();
            dataRecord.calcSugar();

        }
        
        //printing the format of the table
        System.out.println("|       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println("| Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println("|-------|----------|---------------|--------------|----------|-----------|-----------|");

        // CheeseCakeV1 dataRecord;
        
        //using a for loop to print out the objects' data
        for(int index = 0; index < cake.size(); index ++)
        {
            System.out.println("|   " + index + "   |    " + cake.get(index));
        }
    }
}
