package br.com.jdp.sortingandsearching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstBadVersionTest {

    @Test
    public void case1() {
        FirstBadVersion sol = new FirstBadVersion(4);
        assertEquals(4, sol.firstBadVersion(10));
    }

}