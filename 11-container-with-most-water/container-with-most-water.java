class Solution {
    public int maxArea(int[] height) {
        int max_area = 0;
        int l = 0;
        int r = height.length-1;
        
        while (l < r) {
             
            int area = Math.min(height[l],height[r]) * (r-l);
            
            max_area = Math.max(area, max_area);
            
            if (height[l] >= height[r]) {
                r--;
            } else {
                l++;
            }
        }
        
        return max_area;
    }

}