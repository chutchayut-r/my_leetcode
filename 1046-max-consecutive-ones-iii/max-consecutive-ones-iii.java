class Solution {
    public int longestOnes(int[] nums, int k) {
        int length = nums.length;
        int left = 0;
        int right= 0;
        int maxLen = 0;

        for (right = 0; right < length; right++) {  // expand the window
            if (nums[right] == 0) { // flips zero.
                k--;
            }

            if (k<0) {  // shrink window
                if (nums[left] == 0) {  // Now,zero is outside a window. So,increase k value
                    k++;
                }
                left++;
            }

            int diff = right-left+1;
            maxLen = diff > maxLen ? diff : maxLen;
        }

        return maxLen;
    }
}