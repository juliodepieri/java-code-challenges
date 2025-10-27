package br.com.jdp.math;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeSumTest {
    @Test
    public void testThreeSum() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );

        List<List<Integer>> result = ThreeSum.threeSum(nums);

        // Sort both lists for consistent comparison
        expected.sort(Comparator.comparing((List<Integer> l) -> l.get(0))
                .thenComparing(l -> l.get(1))
                .thenComparing(l -> l.get(2)));
        result.sort(Comparator.comparing((List<Integer> l) -> l.get(0))
                .thenComparing(l -> l.get(1))
                .thenComparing(l -> l.get(2)));

        assertEquals(expected, result);
    }

    @Test
    public void testNoTriplets() {
        int[] nums = {1, 2, 3, 4};
        List<List<Integer>> expected = Collections.emptyList();

        assertEquals(expected, ThreeSum.threeSum(nums));
    }

    @Test
    public void testAllZeros() {
        int[] nums = {0, 0, 0, 0};
        List<List<Integer>> expected = Collections.singletonList(Arrays.asList(0, 0, 0));

        assertEquals(expected, ThreeSum.threeSum(nums));
    }
}