/**
 * @author Eli
 * @date 12/5/21
 * @purpose Create and perform object methods to get a better understanding of OOP
 * 
 * PMR
 * This was kind of a challenge. I wasted a lot of time trying to get an "Object" to
 * do that would make sense. I think I got something that works. Other than that, I 
 * comprehend what is going on in this program.
 * 
 */

public class BookTester {
    public static void main(String[] args)
    {
        BookV3 lostHero = new BookV3();

        System.out.println("\t\t\t" + "Books:");
        System.out.println("Title\t\tAuthor\t\tPages per Chapter\tDifference");
        for (int i = 0; i < 75; i++)
        {
            System.out.print("=");
        }
        System.out.println();
        System.out.println(lostHero.getTitle() + "\t" + lostHero.getAuthor() + "\t" + lostHero.pagesPerChapter() + "\t" + lostHero.difference());
    }
}
