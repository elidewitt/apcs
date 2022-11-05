/**
 * 
 * @author Eli R DeWitt
 * @version 3/7/22
 * @purpose Practice class hierarchies by using the extend keyword
 * 
 * @PMR This was very easy. I like how we can relate real world objects
 * to objects in code and think of it in a more concrete manner.
 * 
 */


public class GameTerrainTester {
    public static void main(String [] args) {

        Terrain terrain = new Terrain(100, 200);
        System.out.println(terrain.getTerrainSize());

        Forest forest = new Forest(150, 210, 248);
        System.out.println(forest.getTrees());

        Mountain mountain = new Mountain(120, 130, 4);
        System.out.println(mountain.getMountains());

        WinterMountain winterMountain = new WinterMountain(45, 475, 78, -3.6);
        System.out.println(winterMountain.getWinterMountainInfo());

        Desert desert = new Desert(123, 123, 123);
        System.out.println(desert.getDesertInfo()); 

        SnowyForest snowyForest = new SnowyForest(154, 53, 34, 54); 
        System.out.println(snowyForest.getSnowyForestInfo());
    }
}
