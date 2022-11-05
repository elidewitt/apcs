/**
 * @author Eli R DeWitt
 * @date 2/2/22
 * @purpose Use both arrays and ArrayLists to store and manipulate data
 * 
 * @PMR I liked this project. It really shows how similar arrays and ArrayLists are because the only thing I had to change
 * from V3 was changing the arguments to the methods from Candidate [] candidates to ArrayList<Candidate> candidates.
 */


import java.util.ArrayList;
public class ElectionTesterV6 {
    public static void main(String [] args) {
        ArrayList<Candidate> candidates = new ArrayList<Candidate>();
        candidates.add(new Candidate("Arthur", 1491));
        candidates.add(new Candidate("Lancelot", 1962));
        candidates.add(new Candidate("Merlin", 1968));
        candidates.add(new Candidate("Galahad", 2691));
        candidates.add(new Candidate("Eggsy", 3691));

        printCandidates(candidates);
        System.out.println("\n");
        printElectionResults(candidates);

        insertCandidate(candidates, 3, "Valentine", 1274);
        insertCandidateBefore(candidates, "Merlin", "Charlie", 1383);
    }

    public static void printCandidates(ArrayList<Candidate> candidates) {
        System.out.println("Raw Election Data:\n");
        for (Candidate candidate : candidates) {
            System.out.println(candidate.getName() + " received " + candidate.getVotes() + " votes.");
        }
    }

    public static int getTotalVotes(ArrayList<Candidate> candidates) {
        int votes = 0;
        for (Candidate candidate : candidates) votes += candidate.getVotes();
        return votes;
    }

    public static void printElectionResults(ArrayList<Candidate> candidates) {
        System.out.println("Election Results:\n");
        System.out.println("              Votes     % of Total");
        System.out.println("Candidate    Received      Votes");
        System.out.println("==================================");
        for (Candidate candidate : candidates) {
            double percentOfVotes = (double) candidate.getVotes() / getTotalVotes(candidates) * 100;
            System.out.printf("%-15s%4s%14.2f\n", candidate.getName(), candidate.getVotes(), percentOfVotes);
        }
        System.out.println("\nThe total number of votes is: " + getTotalVotes(candidates));
    }

    public static void setCandidateName(ArrayList<Candidate> candidates, String find, String name) {
        Boolean updated = false;
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(find)) {
                candidate.setName(name);
                updated = true;
            }
        }
        if (!updated) System.out.printf("Couldn't find a candidate with name \"%s\"", find);

        System.out.printf("<< Changing %s to %s >>", find, name);
        printElectionResults(candidates);
    }
    public static void setCandidateVotes(ArrayList<Candidate> candidates, String find, int votes) {
        Boolean updated = false;
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(find)) {
                candidate.setVotes(votes);
                updated = true;
            }
        }
        if (!updated) System.out.printf("Couldn't find a candidate with name \"%s\"", find);

        System.out.printf("<< Changing %s votes to %s >>", find, votes);
        printElectionResults(candidates);
    }

    public static void setCandidate(ArrayList<Candidate> candidates, String find, String name, int votes) {
        Boolean updated = false;
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(find)) {
                candidate.setName(name);
                candidate.setVotes(votes);
                updated = true;
            }
        }
        if (!updated) System.out.printf("Couldn't find a candidate with name \"%s\"", find);

        System.out.printf("<< Changing %s to %s with %s votes >>", find, name, votes);
        printElectionResults(candidates);
    }

    public static void insertCandidate(ArrayList<Candidate> candidates, int position, String name, int numVotes) {
        candidates.add(position, new Candidate(name, numVotes));

        System.out.printf("\n<< At index %s, inserting %s with %s votes >>", position, name, numVotes);
        printElectionResults(candidates);
    }

    public static void insertCandidateBefore(ArrayList<Candidate> candidates, String find, String name, int numVotes) {
        int position = -1;
        for (int i = 0; i < candidates.size(); i++) {
            if (candidates.get(i).getName().equals(find)) position = i;
        }

        if (position != -1) {
            candidates.add(position, new Candidate(name, numVotes));

            System.out.printf("\n<< Before %s, add %s, %s votes >>", find, name, numVotes);
            printElectionResults(candidates);
        }
        else System.out.printf("Couldn't find candidate %s", find);
    }
}
