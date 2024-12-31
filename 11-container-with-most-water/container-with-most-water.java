class Solution {
    public int maxArea(int[] height) {
        int max_area = 0;
        int l = 0;
        int r = height.length-1;

        while (l < r) {
            int minHeight = Math.min(height[l], height[r]);
            int area = minHeight * (r-l);

            max_area = Math.max(max_area, area);

            if (height[l] <= height[r]) {
                l++;
                continue;
            }

            r--;
        }

        return max_area;
    }
}