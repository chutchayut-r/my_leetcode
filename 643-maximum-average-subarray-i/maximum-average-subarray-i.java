class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg_max = 0;
        double sum = 0;
        int n = nums.length;

        if (k > n) {
            return nums[0];
        }

        for (int i = 0; i < k; i++) {
            sum += nums[i];
            avg_max = sum/ (double) k;
        }

        for (int j = k; j < n; j++) {
            sum = sum + nums[j] - nums[j-k];
            avg_max = Double.max(avg_max, sum/(double) k);
        }

        return avg_max;
    }
}