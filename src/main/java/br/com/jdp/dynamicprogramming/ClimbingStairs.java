package br.com.jdp.dynamicprogramming;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/569/
public class ClimbingStairs {
    /**
     * DP Iterative, O(n) time, O(1) space
     */
    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int firstSolution = 1;
        int secondSolution = 2;

        // calculate the number of ways to climb the stairs, sum of the previous two solutions of the current solution
        for (int i = 3; i <= n; i++) {
            int thirdSolution = firstSolution + secondSolution;
            firstSolution = secondSolution;
            secondSolution = thirdSolution;
        }

        return secondSolution;
    }

}
