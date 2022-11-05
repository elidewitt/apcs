/**
 * @author Eli R DeWitt
 * @version 1/2/22
 * @purpose the purpose of this program is to implement selection
 * insersion and use recuresion to implement merge sort.
 * 
 * I didn't include any examples for descending order, but the code is
 * here and can just change the 1 to a 2 for descending (lines 32 and 35).
 * 
 * @PMR pretty simple. reused a lot of code. merge sort is interesting.
 */

import java.util.Arrays;
public class BookStoreTester {
    public static void main(String [] args) {

        Book books [] = new Book[10];
        books[0] = new Book("The Lightning Theif", 38211040, 9.99, 29);
        books[1] = new Book("The Sea of Monsters", 17046086, 9.49, 6);
        books[2] = new Book("The Titan's Curse", 27722100, 8.99, 26);
        books[3] = new Book("The Battle of the Labyrinth", 44246512, 9.47, 10);
        books[4] = new Book("The Last Olympian", 53815742, 10.19, 6);
        books[5] = new Book("The Lost Hero", 75433601, 12.99, 11);
        books[6] = new Book("The Son of Neptune", 12557440, 13.19, 13);
        books[7] = new Book("The Mark of Athena", 72806285, 14.99, 16);
        books[8] = new Book("The House of Hades", 59630138, 14.19, 20);
        books[9] = new Book("The Blood of Olympus", 22752917, 14.49, 23);
        System.out.println("ORIGINAL");
        printBooks(books);

        System.out.println("SORTED BY NAME (INSERTION-ASCENDING)");
        Book [] byName = insertionSort_bookName(books, 1);
        printBooks(byName);

        System.out.println("SORTED BY NAME (INSERTION-DESCENDING)");
        byName = insertionSort_bookName(books, 2);
        printBooks(byName);


        System.out.println("SORTED BY PRODUCT NUMBER (SELECTION-ASCENDING)");
        Book [] byProductNum = selectionSort_bookNumber(books, 1);
        printBooks(byProductNum);

        System.out.println("SORTED BY PRODUCT NUMBER (SELECTION-DESCENDING)");
        byProductNum = selectionSort_bookNumber(books, 2);
        printBooks(byProductNum);

        System.out.println("SORTED BY PRICE (MERGE)");
        mergeSort_bookPrice(books, 0, books.length -1);
        printBooks(books);

        System.out.println("SORTED BY QUANTITY (SELECTION-ASCENDING)");
        Book [] byQuantity = selectionSort_bookQuantity(books, 1);
        printBooks(byQuantity);

        System.out.println("SORTED BY QUANTITY (SELECTION-DESCENDING)");
        byQuantity = selectionSort_bookQuantity(books, 2);
        printBooks(byQuantity);
    
    }

    public static void printBooks(Book [] books) {
        System.out.printf("%-27s   %-14s   %-6s    %-8s%n",
        "Name", "Product Number", "Price", "Quantity");
        for (int i = 0; i < 70; i++) {System.out.print("="); }
        System.out.println();
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public static Book [] insertionSort_bookName(Book books [], int order) {
        Book [] result = new Book[10];
        int ascending = 3 - 2 * order; // clever arithmetic to make conditions easier later
        for (int i = 0; i < books.length; i++) {
            int newIndex = 0;
            for (int j = i; j > 0 && newIndex == 0; j--) {
                if (books[i].getName().compareTo(result[j - 1].getName()) * ascending > 0) newIndex = j;
                else result[j] = result[j - 1];
            }
            result[newIndex] = books[i];
        }
        return result;
    }

    public static Book [] selectionSort_bookNumber(Book books [], int order) {
        Book [] result = Arrays.copyOf(books, books.length);
        int ascending = 3 - 2 * order;
        for (int i = result.length - 1; i >= 0; i--) {
            int indexMax = 0;
            for (int j = 0; j <= i; j++) {
                if (result[j].getProductNum() * ascending > result[indexMax].getProductNum() * ascending) indexMax = j;
            }
            Book temp = result[i];
            result[i] = result[indexMax];
            result[indexMax] = temp;
        }
        return result;
    }

    public static void mergeSort_bookPrice(Book[] a, int low, int high)
    {
        if( low == high )
            return;

        int mid = ( low + high ) / 2;

        mergeSort_bookPrice( a, low, mid );       // recursive call
        mergeSort_bookPrice( a, mid + 1, high);   // recursive call

        //Debugging Statements 
        //uncomment to print the listings after each pass through the sort
        //System.out.println("\nCurrent list");
        //for(HouseListing h : a)  
        //    if( h != null) System.out.printf("$%10.2f \n", h.getCost() );
                
        merge( a, low, mid, high);
    }
    
    public static void merge(Book[] a, int low, int mid, int high )
    {
        Book[] temp = new Book[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = a[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else if( a[ i ].getPrice() < a[ j ].getPrice() )
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else
            {
                temp[ n ] = a[ j ];
                j++;
            }
            n++;
        }

        for( int k = low ; k <= high ; k++ )
            a[ k ] = temp[ k - low ];
    }


    public static Book [] selectionSort_bookQuantity(Book books [], int order) {
        Book [] result = Arrays.copyOf(books, books.length);
        int ascending = 3 - 2 * order;
        for (int i = result.length - 1; i >= 0; i--) {
            int indexMax = 0;
            for (int j = 0; j <= i; j++) {
                if (result[j].getQuantity() * ascending > result[indexMax].getQuantity() * ascending) indexMax = j;
            }
            Book temp = result[i];
            result[i] = result[indexMax];
            result[indexMax] = temp;
        }
        return result;
    }

}
