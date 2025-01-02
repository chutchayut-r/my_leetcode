class Solution {
    public int longestSubarray(int[] nums) {
        int k = 1;
        int maxLen = 0;
        int l = 0;

        for (int r=0; r < nums.length; r++) {
            if (nums[r] == 0) {
                k--;
            }

            if (k < 0) {
                if (nums[l] == 0) {
                    k ++;
                }
                l++;
            }

            int diff = r-l;
            maxLen = Math.max(maxLen, diff);
        }

        return maxLen;
    }
}