class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg_max = 0;
        double sum = 0;
        double double_k = (double)k;
        int n = nums.length;

        if (k > n) {
            return nums[0];
        }

        for (int i = 0; i < k; i++) {
            sum += nums[i];
            avg_max = sum/ double_k;
        }

        for (int j = k; j < n; j++) {
            sum = sum + nums[j] - nums[j-k];
            double avg_cur =  sum / double_k;
            avg_max = avg_max < avg_cur ? avg_cur : avg_max;
        }

        return avg_max;
    }
}