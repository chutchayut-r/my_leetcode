class Solution {
   public int maxOperations(int[] nums, int k) {
        int l = 0;
        int r = nums.length-1;
        int output = 0;

        Arrays.sort(nums);

        while (r > l) {
            int sum = nums[l] + nums[r];

            if (sum == k) {
                output++;
                l++;
                r--;
            } else {
               if (sum > k) {
                   r--;
               } else {
                   l++;
               }
            }

        }

        return  output;
    }
}