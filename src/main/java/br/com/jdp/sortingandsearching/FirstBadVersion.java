package br.com.jdp.sortingandsearching;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/96/sorting-and-searching/774/
public class FirstBadVersion extends VersionControl {
    public FirstBadVersion(int firstBad) {
        super(firstBad);
    }

    /**
     * Time = O(log n) Binary search
     * Space=O(1) Constant extra space
     */
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;  // avoids overflow

            if (isBadVersion(mid)) {
                // If mid is bad, the first bad version is at mid or before mid
                right = mid;
            } else {
                // If mid is good, the first bad version is after mid
                left = mid + 1;
            }
        }
        // At the end, left == right and points to the first bad version
        return left;
    }
}
