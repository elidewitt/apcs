/**
 * This class models a calculator with specific use for memory and what is returned. Methods revolve
 * around calculating information relevant to primes
 */

import java.util.ArrayList;
public class PrimeCalculator {

    // initalize variables
    private ArrayList<Integer> memory;
    public PrimeCalculator() { this.memory = new ArrayList<Integer>(); }

    // memory getter method
    public ArrayList<Integer> getMemory() { return this.memory; }

    // evaluates numbers for primeness
    public boolean isPrime(int num) {
        if (num < 0) return false;
        if (num == 0 || num == 1) return false;
        for (int p = 2; p < num; p++) if (num % p == 0) return false;
        return true;
    }

    // gathers primes within specified range and stores the list of primes to memory and returns size
    public int getPrimesInRange(int lowerBound, int upperBound) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = lowerBound; i < upperBound; i++) if (isPrime(i)) result.add(i);
        this.memory = result;
        return result.size();
    }
}
