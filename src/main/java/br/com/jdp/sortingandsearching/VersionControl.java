package br.com.jdp.sortingandsearching;

public class VersionControl {
    private int firstBad;  // the "first bad" version

    public VersionControl(int firstBad) {
        this.firstBad = firstBad;
    }

    // The API LeetCode provides
    public boolean isBadVersion(int version) {
        return version >= firstBad;
    }
}
