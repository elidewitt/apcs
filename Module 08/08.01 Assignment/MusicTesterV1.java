/**
 * @author Eli R DeWitt
 * @version 2/12/2022
 * @purpose Use a squential search algorithm to find song in an array
 * 
 * @PMR This assignment was relatively simple. I see that the next assignment is about
 * binary search, so that will require a sorting algorithm first before the binary search.
 * One this I noticed though is on the rubric it says "Create a selection search method
 * to find a title." it also says "selection search" for the year, and artist. Is a selection
 * search the same thing as a sequential search?
 */

public class MusicTesterV1 {
    public static void main(String [] args) {
        
        Music [] songs = {
            new Music("Livin' on a Prayer", 1986, "Bon Jovi"),
            new Music("Butterflies and Hurricanes", 2004, "Muse"),
            new Music("Mercy Me", 2005, "Alkaline Trio"),
            new Music("Lowlife", 2020, "Neck Deep"),
            new Music("Go With The Flow", 2002, "Queens of the Stone Age"),
            new Music("In Bloom", 2018, "Neck Deep"),
            new Music("Reckless Paradise", 2020, "Billy Talent"),
            new Music("All My Life", 2002, "Foo Fighters"),
            new Music("Skeletons", 2019, "Driveways"),
            new Music("Kings of the Weekend", 2016, "blink-182"),
        };


        System.out.println("\n<< Original Data >>\n");
        printSongs(songs);

        System.out.println("\n<< Title = Mercy Me >>\n");
        searchByTitle(songs, "Mercy Me");

        System.out.println("\n<< Title = Time To Waste >>\n");
        searchByTitle(songs, "Time To Waste");
        
        System.out.println("\n<< Year = 2002 >>\n");
        searchByYear(songs, 2002);

        System.out.println("\n<< Year = 2001 >>\n");
        searchByYear(songs, 2001);
        
        System.out.println("\n<< Artist = Neck Deep >>\n");
        searchByArtist(songs, "Neck Deep");

        System.out.println("\n<< Artist = Green Day >>\n");
        searchByArtist(songs, "Green Day");
    }

    public static void printSongs(Music [] songs) {
        System.out.printf("%-30s %4s %-20s%n", "Song Title",  "Year" , "Artist");
        System.out.println("===========================================================");
        for (Music song : songs) {
            System.out.printf("%-30s %4d %-20s%n",
                song.getTitle(), song.getYear(), song.getArtist()
            );
        }
        System.out.println();
    }

    public static void searchByTitle(Music [] songs, String targetTitle) {
        Boolean found = false;
        for (Music song : songs) {
            if (song.getTitle().equals(targetTitle)) {
                System.out.println(song);
                found = true;
            }
        }
        if (!found) System.out.printf("Couldn't find song with title %s%n", targetTitle);
    }

    public static void searchByYear(Music [] songs, int targetYear) {
        Boolean found = false;
        for (Music song : songs) {
            if (song.getYear() == targetYear) {
                System.out.println(song);
                found = true;
            }
        }
        if (!found) System.out.printf("Couldn't find song with year %s%n", targetYear);
    }

    public static void searchByArtist(Music [] songs, String targetArtist) {
        Boolean found = false;
        for (Music song : songs) {
            if (song.getArtist().equals(targetArtist)) {
                System.out.println(song);
                found = true;
            }
        }
        if (!found) System.out.printf("Couldn't find song with artist %s%n", targetArtist);
    }
}
