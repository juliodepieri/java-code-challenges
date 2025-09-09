package br.com.jdp.math;

public class CountPrimes {
    /**
     * time = O(n log log n)
     * space = O(n)
     */
    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];
        // Mark all odd numbers as true (even numbers are not prime except 2)
        for (int i = 3; i < n; i += 2) {
            isPrime[i] = true;
        }

        int count = 1;

        // Sieve of Eratosthenes + Only check odd numbers
        for (int p = 3; p * p < n; p += 2) {
            if (isPrime[p]) {
                // j = multiple of the current prime
                for (int j = p * p; j < n; j += 2 * p) {
                    isPrime[j] = false;
                }
            }
        }

        // Count remaining primes (odd ones)
        for (int i = 3; i < n; i += 2) {
            if (isPrime[i]) count++;
        }

        return count;
    }
}
