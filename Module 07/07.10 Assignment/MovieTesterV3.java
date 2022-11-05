import java.util.Arrays;

/**
 * 
 * @author Eli R DeWitt
 * @date 2/10/22
 * @purpose implement the selection sort algorithm
 * 
 * 
 * @PMR The structure of this class stayed relatively the same, just adjusted the loops and variables a little bit
 * I did have to look into how to clone an array because if I remember correctly, setting a variable to a list won't
 * clone it, but instead just reference the original array. I wanted to make the methods work in a way that wouldn't 
 * alter the input array, but just return the requested sorted one.
 * 
 */

public class MovieTesterV3 {
    

    public static void main(String [] args) {
        Movie movies [] = {

            new Movie("The Emperor's New Groove", 2000, "Disney"),
            new Movie("Meet the Robinsons", 2007, "Disney"),
            new Movie("The Rescuers", 1977, "Disney"),
            new Movie("Rocky", 1976, "Chartoff-Winkler"),
            new Movie("1977", 2019, "DreamWorks "),
            new Movie("The Little Rascals", 1994, "Amblin"),
            new Movie("Garfield Gets Real", 2007, "Davis Entertainment"),
            new Movie("First Man", 2018, "Universal"),
            new Movie("Coco", 2017, "Disney"),
            new Movie("Chicken Little", 2005, "Disney"),
        };

        System.out.println("\n<< Original Data >>\n");
        printMovies(movies);

        System.out.println("\n<< Sorted by Title (Ascending) >>\n");
        printMovies(sortMovies_Title(movies, 1));
        System.out.println("\n<< Sorted by Title (Descending) >>\n");
        printMovies(sortMovies_Title(movies, 2));

        System.out.println("\n<< Sorted by Year (Ascending) >>\n");
        printMovies(sortMovies_Year(movies, 1));
        System.out.println("\n<< Sorted by Year (Descending) >>\n");
        printMovies(sortMovies_Year(movies, 2));

        System.out.println("\n<< Sorted by Studio (Ascending) >>\n");
        printMovies(sortMovies_Studio(movies, 1));
        System.out.println("\n<< Sorted by Studio (Descending) >>\n");
        printMovies(sortMovies_Studio(movies, 2));
    }


    public static void printMovies(Movie movies []) {
        for (Movie movie : movies) System.out.println(movie);
    }

    public static Movie [] sortMovies_Title(Movie movies [], int order) {
        Movie [] result = Arrays.copyOf(movies, movies.length);
        int ascending = 3 - 2 * order;
        for (int i = result.length - 1; i >= 0; i--) {
            int indexMax = 0;
            for (int j = 0; j <= i; j++) {
                if (result[j].getTitle().compareTo(result[indexMax].getTitle()) * ascending > 0) indexMax = j;
            }
            Movie temp = result[i];
            result[i] = result[indexMax];
            result[indexMax] = temp;
        }
        return result;
    }

    public static Movie [] sortMovies_Year(Movie movies [], int order) {
        Movie [] result = Arrays.copyOf(movies, movies.length);
        int ascending = 3 - 2 * order;
        for (int i = result.length - 1; i >= 0; i--) {
            int indexMax = 0;
            for (int j = 0; j <= i; j++) {
                if (result[j].getYear() * ascending > result[indexMax].getYear() * ascending) indexMax = j;
            }
            Movie temp = result[i];
            result[i] = result[indexMax];
            result[indexMax] = temp;
        }
        return result;
    }

    public static Movie [] sortMovies_Studio(Movie movies [], int order) {
        Movie [] result = Arrays.copyOf(movies, movies.length);
        int ascending = 3 - 2 * order;
        for (int i = result.length - 1; i >= 0; i--) {
            int indexMax = 0;
            for (int j = 0; j <= i; j++) {
                if (result[j].getStudio().compareTo(result[indexMax].getStudio()) * ascending > 0) indexMax = j;
            }
            Movie temp = result[i];
            result[i] = result[indexMax];
            result[indexMax] = temp;
        }
        return result;
    }
}
