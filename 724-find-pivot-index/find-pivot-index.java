class Solution {
    public int pivotIndex(int[] nums) {

        int inputLen = nums.length;
        int[] prefixSum = new int[inputLen]; // default value of int is zero.

        prefixSum[0] = nums[0];

        for (int i=1; i<inputLen; i++) {
            int sum = nums[i] + prefixSum[i-1];
            prefixSum[i] = sum;
        }

        for (int k=0; k<inputLen; k++) {
            int leftSum = k == 0 ? 0 : prefixSum[k] - nums[k];
            int rightSum = k == inputLen-1 ? 0 : prefixSum[inputLen-1] - prefixSum[k];

            if (leftSum == rightSum) {
                return k;
            }
        }

        return -1;
    }
}