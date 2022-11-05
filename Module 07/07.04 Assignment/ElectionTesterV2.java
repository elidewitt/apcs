import java.util.ArrayList;
public class ElectionTesterV2 {
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

}
