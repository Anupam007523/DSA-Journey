class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int currentArea = width * minHeight;

             if (currentArea > maxWater) {
                maxWater = currentArea;
            }

            if (height[left] < height[right]) {
                int lastLeftHeight = height[left];
                while (left < right && height[left] <= lastLeftHeight) {
                    left++;
                }
            } else {
                int lastRightHeight = height[right];
                while (left < right && height[right] <= lastRightHeight) {
                    right--;
                }
            }

        }
        return maxWater;

    }
}