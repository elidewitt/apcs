/**
 * @author Eli R DeWitt
 * @version 2/12/2022
 * @purpose Use a squential search algorithm to find song in an array
 * 
 * @PMR In the assignment instructions it says to rename this to V3 and I don't
 * remember doing a V2 of this class. I feel like this assignment would be a lot
 * easier if title, year, or author was a parameter passed into a single method
 * instead of having separate ones for each category.
 */

public class MusicTesterV2 {
    public static void main(String [] args) {
        
        Music [] songs = {
            new Music("In Bloom", 1986, "Nirvana"),
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

        // confirm sorts function as expected 

        // selectionSortByTitle(songs);
        // printSongs(songs);
        // selectionSortByYear(songs);
        // printSongs(songs);
        // selectionSortByArtist(songs);
        // printSongs(songs);

        searchByTitle(songs, "Mercy Me");
        searchByTitle(songs, "In Bloom");
        searchByTitle(songs, "Time To Waste");
        
        searchByYear(songs, 2002);
        searchByYear(songs, 2020);
        searchByYear(songs, 2001);

        searchByArtist(songs, "blink-182");
        searchByArtist(songs, "Neck Deep");
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

    public static void selectionSortByTitle(Music [] songs) {
        for (int i = songs.length - 1; i >= 0; i--) {
            int indexMax = 0;
            for (int j = 0; j <= i; j++) {
                if (songs[j].getTitle().compareTo(songs[indexMax].getTitle()) > 0) {
                    indexMax = j;
                }
            }
            Music temp = songs[i];
            songs[i] = songs[indexMax];
            songs[indexMax] = temp;
        }
    }

    public static void selectionSortByYear(Music [] songs) {
        for (int i = songs.length - 1; i >= 0; i--) {
            int indexMax = 0;
            for (int j = 0; j <= i; j++) {
                if (songs[j].getYear() > songs[indexMax].getYear()) {
                    indexMax = j;
                }
            }
            Music temp = songs[i];
            songs[i] = songs[indexMax];
            songs[indexMax] = temp;
        }
    }

    public static void selectionSortByArtist(Music [] songs) {
        for (int i = songs.length - 1; i >= 0; i--) {
            int indexMax = 0;
            for (int j = 0; j <= i; j++) {
                if (songs[j].getArtist().compareTo(songs[indexMax].getArtist()) > 0) {
                    indexMax = j;
                }
            }
            Music temp = songs[i];
            songs[i] = songs[indexMax];
            songs[indexMax] = temp;
        }
    }

    public static void searchByTitle(Music [] songs, String targetTitle) {

        System.out.printf("%n<< Title : %s >>%n", targetTitle);

        selectionSortByTitle(songs);
        int [] bounds = {-1, songs.length};
        int probe = -1;
        while(bounds[1] - bounds[0] > 1)
        {
            probe = (bounds[1] + bounds[0] ) / 2;
            if(songs[probe].getTitle().compareTo(targetTitle) > 0)  bounds[1] = probe;
            else {
                bounds[0] = probe;
                if (songs[probe].getTitle().equalsIgnoreCase(targetTitle)) break;
            }
        }

        if (bounds[0] >= 0 && songs[bounds[0]].getTitle().equalsIgnoreCase(targetTitle)) {
            linearPrintTitle(songs, bounds[0], targetTitle);
        }
        else System.out.printf("Song(s) with title %s wasn't found%n", targetTitle);
    }

    public static void linearPrintTitle(Music [] songs, int lowerBound, String targetTitle) {
        int [] bounds = {lowerBound, lowerBound};
        // look left for indentical data
        for (int i = lowerBound - 1; i >= 0 && songs[i].getTitle().equalsIgnoreCase(targetTitle); i--) {
            bounds[0] = i;
        }

        // look right for indentical data
        for (int i = lowerBound + 1; i < songs.length && songs[i].getTitle().equalsIgnoreCase(targetTitle); i++) {
            bounds[1] = i;
        }

        // print valid results
        for (int i = bounds[0]; i <= bounds[1]; i ++) {
            System.out.println(songs[i]);
        }
    }

    public static void searchByYear(Music [] songs, int targetYear) {

        System.out.printf("%n<< Year : %s >>%n", targetYear);

        selectionSortByYear(songs);

        int [] bounds = {-1, songs.length};
        int probe = -1;
        while(bounds[1] - bounds[0] > 1)
        {
            probe = (bounds[1] + bounds[0] ) / 2;
            if(songs[probe].getYear() > targetYear)  bounds[1] = probe;
            else {
                bounds[0] = probe;
                if (songs[probe].getYear() == targetYear) break;
            }
        }

        if (bounds[0] >= 0 && songs[bounds[0]].getYear() == targetYear) {
            linearPrintYear(songs, bounds[0], targetYear);
        }
        else System.out.printf("Song(s) from %s wasn't found%n", targetYear);
    }

    public static void linearPrintYear(Music [] songs, int lowerBound, int targetYear) {
        int [] bounds = {lowerBound, lowerBound};
        // look left for indentical data
        for (int i = lowerBound - 1; i >= 0 && songs[i].getYear() == targetYear; i--) {
            bounds[0] = i;
        }

        // look right for indentical data
        for (int i = lowerBound + 1; i < songs.length && songs[i].getYear() == targetYear; i++) {
            bounds[1] = i;
        }

        // print valid results
            for (int i = bounds[0]; i <= bounds[1]; i ++) {
            System.out.println(songs[i]);
        }
    }

    public static void searchByArtist(Music [] songs, String targetArtist) {

        System.out.printf("%n<< Artist : %s >>%n", targetArtist);

        selectionSortByArtist(songs);
        int [] bounds = {-1, songs.length};
        int probe = -1;
        while(bounds[1] - bounds[0] > 1)
        {
            probe = (bounds[1] + bounds[0] ) / 2;
            if(songs[probe].getArtist().compareTo(targetArtist) > 0)  bounds[1] = probe;
            else {
                bounds[0] = probe;
                if (songs[probe].getArtist().equalsIgnoreCase(targetArtist)) break;
            }
        }

        if (bounds[0] >= 0 && songs[bounds[0]].getArtist().equalsIgnoreCase(targetArtist)) {
            linearPrintArtist(songs, bounds[0], targetArtist);
        }
        else System.out.printf("Song(s) by %s wasn't found%n", targetArtist);
    }

    public static void linearPrintArtist(Music [] songs, int lowerBound, String targetArtist) {
        int [] bounds = {lowerBound, lowerBound};
        // look left for indentical data
        for (int i = lowerBound - 1; i >= 0 && songs[i].getArtist().equalsIgnoreCase(targetArtist); i--) {
            bounds[0] = i;
        }

        // look right for indentical data
        for (int i = lowerBound + 1; i < songs.length && songs[i].getArtist().equalsIgnoreCase(targetArtist); i++) {
            bounds[1] = i;
        }

        // print valid results
        for (int i = bounds[0]; i <= bounds[1]; i ++) {
            System.out.println(songs[i]);
        }
    }
}
