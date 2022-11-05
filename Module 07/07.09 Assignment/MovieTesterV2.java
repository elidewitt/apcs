/**
 * 
 * @author Eli R DeWitt
 * @date 2/9/22
 * @purpose implement the insertion sort algorithm
 * 
 * 
 * @PMR I'm proud of this. I didn't want to make two copies of pretty much the same inequality
 * to differentiate between ascending and descending, so I found a clever solution. I used a
 * simple linear equation to translate the 1 and 2 that you can input into -1 and 1. Because of
 * how inequalities work, I was able to flip the sign of the inequality without actually doing
 * just by multiplying both sides by -1 if descending, and 1 if ascending.
 * 
 */

public class MovieTesterV2 {
    

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

        System.out.println("<< Original Data >>");
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
        Movie [] result = new Movie[10];
        int ascending = 3 - 2 * order; // clever arithmetic to make conditions easier later
        for (int i = 0; i < movies.length; i++) {
            int newIndex = 0;
            for (int j = i; j > 0 && newIndex == 0; j--) {
                if (movies[i].getTitle().compareTo(result[j - 1].getTitle()) * ascending > 0) newIndex = j;
                else result[j] = result[j - 1];
            }
            result[newIndex] = movies[i];
        }
        return result;
    }

    public static Movie [] sortMovies_Year(Movie movies [], int order) {
        Movie [] result = new Movie[10];
        int ascending = 3 - 2 * order; // clever arithmetic to make conditions easier later
        for (int i = 0; i < movies.length; i++) {
            int newIndex = 0;
            for (int j = i; j > 0 && newIndex == 0; j--) {
                if (movies[i].getYear() * ascending > result[j - 1].getYear() * ascending) newIndex = j;
                else result[j] = result[j - 1];
            }
            result[newIndex] = movies[i];
        }
        return result;
    }

    public static Movie [] sortMovies_Studio(Movie movies [], int order) {
        Movie [] result = new Movie[10];
        int ascending = 3 - 2 * order; // clever arithmetic to make conditions easier later
        for (int i = 0; i < movies.length; i++) {
            int newIndex = 0;
            for (int j = i; j > 0 && newIndex == 0; j--) {
                if (movies[i].getStudio().compareTo(result[j - 1].getStudio()) * ascending > 0) newIndex = j;
                else result[j] = result[j - 1];
            }
            result[newIndex] = movies[i];
        }
        return result;
    }
}
