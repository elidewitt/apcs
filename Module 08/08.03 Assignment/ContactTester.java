/**
 * @author Eli R DeWitt
 * @version 2/16/22
 * @purpose The purpose of this program was to use our new knowledge of sorting and searching algorithms to manipulate
 * and display contact data
 * @PMR This program was relativly easy now that I'm more familiar with how the algorithms work.
 */

public class ContactTester {
    public static void main (String [] args) {
        Contact [] contacts = {
            new Contact("Mathias", "Brother", "Jan 26", "787-308-9064", "Matt75@yahoo.com"),
            new Contact("Sean", "Uncle", "Feb 16", "701-388-6379", "sean_lehner24@hotmail.com"),
            new Contact("Isla", "Aunt", "Mar 1", "810-670-7364", "isla0@yahoo.com"),
            new Contact("Lester", "Uncle", "Mar 8", "219-208-2016", "lester_abbott30@gmail.com"),
            new Contact("Liv", "Cousin", "Mar 12", "209-603-6266", "liv_marquardt@gmail.com"),
            new Contact("Michael", "Grandpa", "Apr 11", "951-693-1731", "michael_gerlach@hotmail.com"),
            new Contact("Hellen", "Cousin", "May 8", "757-962-5236", "hellen.hartmann@yahoo.com"),
            new Contact("Walt", "Father", "Oct 9", "702-454-4343", "walt.miller49@yahoo.com"),
            new Contact("Roxane", "Mother", "Oct 16", "918-649-4080", "roxane.johnson@yahoo.com"),
            new Contact("Marco", "Cousin", "Oct 22", "817-432-4591", "marco70@gmail.com")
        };

        // printContacts(contacts);
        // selectionSortByName(contacts);
        // printContacts(contacts);
        // selectionSortByRelation(contacts);
        // printContacts(contacts);

        printContacts(contacts);

        binarySearchByName(contacts, "Walt");
        binarySearchByName(contacts, "Eli");

        binarySearchByRelation(contacts, "Cousin");
        binarySearchByRelation(contacts, "Friend");

        sequentialSearchForBirthday(contacts, "Oct");
        sequentialSearchForBirthday(contacts, "Dec");
        
        sequentialSearchForPhone(contacts, "757-962-5236");
        sequentialSearchForPhone(contacts, "123-456-7890");

        sequentialSearchForEmail(contacts, "sean_lehner24@hotmail.com");
        sequentialSearchForEmail(contacts, "john.doe@gmail.com");

    }

    public static void printContacts(Contact [] contacts) {
        System.out.printf("%-8s   %-8s   %-8s   %-12s   %s%n", "Name", "Relation", "Birthday", "Phone", "Email");
        for (int i = 0; i < 75; i++) System.out.print("=");
        System.out.println();
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public static void selectionSortByName(Contact [] contacts) {
        for (int i = contacts.length - 1; i >= 0; i--) {
            int indexMax = 0;
            for (int j = 0; j <= i; j++) {
                if (contacts[j].getName().compareTo(contacts[indexMax].getName()) > 0) indexMax = j;
            }
            Contact temp = contacts[i];
            contacts[i] = contacts[indexMax];
            contacts[indexMax] = temp;
        }
    }

    public static void selectionSortByRelation(Contact [] contacts) {
        for (int i = contacts.length - 1; i >= 0; i--) {
            int indexMax = 0;
            for (int j = 0; j <= i; j++) {
                if (contacts[j].getRelation().compareTo(contacts[indexMax].getRelation()) > 0) indexMax = j;
            }
            Contact temp = contacts[i];
            contacts[i] = contacts[indexMax];
            contacts[indexMax] = temp;
        }
    }

    public static void binarySearchByName(Contact [] contacts, String target) {
        System.out.printf("%n<< Name : %s >>%n", target);
        
        selectionSortByName(contacts);
        int [] bounds = {-1, contacts.length};
        int probe = -1;
        while(bounds[1] - bounds[0] > 1)
        {
            probe = (bounds[1] + bounds[0] ) / 2;
            if(contacts[probe].getName().compareTo(target) > 0)  bounds[1] = probe;
            else {
                bounds[0] = probe;
                if (contacts[probe].getName().equalsIgnoreCase(target)) break;
            }
        }
        if (bounds[0] >= 0 && contacts[bounds[0]].getName().equalsIgnoreCase(target)) {
            System.out.println(contacts[bounds[0]]);
        }
        else System.out.printf("Contact with name %s wasn't found%n", target);
    }

    public static void binarySearchByRelation(Contact [] contacts, String target) {
        System.out.printf("%n<< Relation : %s >>%n", target);

        selectionSortByRelation(contacts);
        int [] bounds = {-1, contacts.length};
        int probe = -1;
        while(bounds[1] - bounds[0] > 1)
        {
            probe = (bounds[1] + bounds[0] ) / 2;
            if(contacts[probe].getRelation().compareTo(target) > 0)  bounds[1] = probe;
            else {
                bounds[0] = probe;
                if (contacts[probe].getRelation().equalsIgnoreCase(target)) break;
            }
        }

        if (bounds[0] >= 0 && contacts[bounds[0]].getRelation().equalsIgnoreCase(target)) {
            linearPrintRelation(contacts, bounds[0], target);
        }
        else System.out.printf("Contact(s) with relation %s wasn't found%n", target);
    }

    public static void linearPrintRelation(Contact [] contacts, int lowerBound, String targetTitle) {
        int [] bounds = {lowerBound, lowerBound};
        // look left for indentical data
        for (int i = lowerBound - 1; i >= 0 && contacts[i].getRelation().equalsIgnoreCase(targetTitle); i--) {
            bounds[0] = i;
        }

        // look right for indentical data
        for (int i = lowerBound + 1; i < contacts.length && contacts[i].getRelation().equalsIgnoreCase(targetTitle); i++) {
            bounds[1] = i;
        }

        // print valid results
        for (int i = bounds[0]; i <= bounds[1]; i ++) {
            System.out.println(contacts[i]);
        }
    }

    public static void sequentialSearchForBirthday(Contact [] contacts, String target) {
        System.out.printf("%n<< Birthday : %s >>%n", target);

        Boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getBirthday().substring(0, 3).equalsIgnoreCase(target)) {
                System.out.println(contact);
                found = true;
            }
        }
        if (!found) System.out.printf("Contact(s) with birthday %s wasn't found%n", target);
    }

    public static void sequentialSearchForPhone(Contact [] contacts, String target) {
        System.out.printf("%n<< Phone : %s >>%n", target);

        Boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getPhone().equalsIgnoreCase(target)) {
                System.out.println(contact);
                found = true;
            }
        }
        if (!found) System.out.printf("Contact(s) with phone %s wasn't found%n", target);
    }

    public static void sequentialSearchForEmail(Contact [] contacts, String target) {
        System.out.printf("%n<< Email : %s >>%n", target);

        Boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getEmail().equalsIgnoreCase(target)) {
                System.out.println(contact);
                found = true;
            }
        }
        if (!found) System.out.printf("Contact(s) with email %s wasn't found%n", target);
    }
}
