package br.com.jdp.others;

public class ContainerWithMostWater {
    /**
     * Time complexity O(n)
     * Space complexity O(1)
     */
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int area = h * width;
            maxArea = Math.max(maxArea, area);

            // Move the smaller height inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
