public class ElectionTesterV5 {
    public static void main(String [] args) {
        Candidate [] candidates = {
            new Candidate("Arthur", 1491),
            new Candidate("Lancelot", 1962),
            new Candidate("Merlin", 1968),
            new Candidate("Galahad", 2691),
            new Candidate("Eggsy", 3691)
        };

        printCandidates(candidates);
        System.out.println("");
        printElectionResults(candidates);

        insertCandidate(candidates, 3, "Valentine", 1274);
        insertCandidateBefore(candidates, "Merlin", "Charlie", 1383);
    }

    public static void printCandidates(Candidate [] candidates) {
        System.out.println("Raw Election Data:\n");
        for (Candidate candidate : candidates) {
            System.out.println(candidate.getName() + " received " + candidate.getVotes() + " votes.");
        }
    }

    public static int getTotalVotes(Candidate [] candidates) {
        int votes = 0;
        for (Candidate candidate : candidates) votes += candidate.getVotes();
        return votes;
    }

    public static void printElectionResults(Candidate [] candidates) {
        System.out.println("Election Results:\n");
        System.out.println("              Votes     % of Total");
        System.out.println("Candidate    Received      Votes");
        System.out.println("==================================");
        for (Candidate candidate : candidates) {
            double percentOfVotes = (double) candidate.getVotes() / getTotalVotes(candidates) * 100;
            System.out.printf("%-15s%4s%14.2f\n", candidate.getName(), candidate.getVotes(), percentOfVotes);
        }
        System.out.printf("\nThe total number of votes is: %s \n\n", getTotalVotes(candidates));
    }

    public static void setCandidateName(Candidate [] candidates, String find, String name) {
        Boolean updated = false;
        for (Candidate candidate : candidates) {
            if (candidate.getName() == find) {
                candidate.setName(name);
                updated = true;
            }
        }
        if (!updated) System.out.printf("Couldn't find a candidate with name \"%s\"", find);

        System.out.printf("<< Changing %s to %s >>", find, name);
        printElectionResults(candidates);
    }
    public static void setCandidateVotes(Candidate [] candidates, String find, int numVotes) {
        Boolean updated = false;
        for (Candidate candidate : candidates) {
            if (candidate.getName() == find) {
                candidate.setVotes(numVotes);
                updated = true;
            }
        }
        if (!updated) System.out.printf("Couldn't find a candidate with name \"%s\"", find);

        System.out.printf("<< Changing %s votes to %s >>", find, numVotes);
        printElectionResults(candidates);
    }

    public static void setCandidate(Candidate [] candidates, String find, String name, int numVotes) {
        Boolean updated = false;
        for (Candidate candidate : candidates) {
            if (candidate.getName() == find) {
                candidate.setName(name);
                candidate.setVotes(numVotes);
                updated = true;
            }
        }
        if (!updated) System.out.printf("Couldn't find a candidate with name \"%s\"", find);

        System.out.printf("<< Changing %s to %s with %s votes >>", find, name, numVotes);
        printElectionResults(candidates);
    }

    public static void insertCandidate(Candidate [] candidates, int position, String name, int numVotes) {
        for (int i = candidates.length - 1; i > position; i--) {
            candidates[i] = candidates[i - 1];
        }
        candidates[position] = new Candidate(name, numVotes);

        System.out.printf("\n<< At index %s, inserting %s with %s votes >>\n\n", position, name, numVotes);
        printElectionResults(candidates);
    }

    public static void insertCandidateBefore(Candidate [] candidates, String find, String name, int numVotes) {
        int position = -1;
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i].getName() == find) position = i;
        }

        if (position != -1) {
            for (int i = candidates.length - 1; i > position; i--) {
                candidates[i] = candidates[i - 1];
            }
            candidates[position] = new Candidate(name, numVotes);
    
            System.out.printf("\n<< Before %s, add %s, %s votes >>\n\n", find, name, numVotes);
            printElectionResults(candidates);
        }
        else System.out.printf("Couldn't find candidate %s", find);
    }
}
