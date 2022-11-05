/**
 * @author Eli
 * @date 12/7/21
 * @purpose Use multiple constructors to compensate for missing info or differing data types
 * 
 * PMR
 * This wasn't too difficult. It makes a lot of sense why create multiple methods/constructors.
 * I also incorperated this idea to the setter methods in case
 * 
 */

public class BookTester {
    public static void main(String[] args)
    {
        BookV8 lostHero = new BookV8();
        BookV8 sonOfNeptune = new BookV8("The Son of Neptune", 513, 52);
        BookV8 everybody = new BookV8("Be Exceptional", "Joe Navarro", 273, 9);
        everybody.setTitle("What Every BODY is Saying");


        System.out.println("\t\t\t" + "Books:");
        System.out.println("Title\t\t\t\tAuthor\t\tPages per Chapter\tDifference");
        for (int i = 0; i < 75; i++)
        {
            System.out.print("=");
        }
        System.out.println();
        System.out.println(lostHero.getTitle() + "\t\t\t" + lostHero.getAuthor() + "\t" + lostHero.pagesPerChapter() + "\t" + lostHero.difference());
        System.out.println(sonOfNeptune.getTitle() + "\t\t" + sonOfNeptune.getAuthor() + "\t" + sonOfNeptune.pagesPerChapter() + "\t" + sonOfNeptune.difference());
        System.out.println(everybody.getTitle() + "\t" + everybody.getAuthor() + "\t" + everybody.pagesPerChapter() + "\t" + everybody.difference());
    }
}

