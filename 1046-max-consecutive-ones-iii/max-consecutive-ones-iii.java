class Solution {
    public int longestOnes(int[] nums, int k) {
        int sum = 0;
        int output = k;
        int windowSize;
        int windowSum;

        for (windowSize = nums.length; windowSize > k; windowSize--) {

            windowSum = calSum(nums, windowSize);

            if (windowSum >= windowSize-k) {
                return windowSize;
            }

            for (int index=0; index+windowSize < nums.length; index++) {
                windowSum -= nums[index];
                windowSum += nums[index+windowSize];

                if (windowSum >= windowSize-k) {
                    return windowSize;
                }
            }
        }

        return output;
    }

    public int calSum(int[] num, int lastIndex) {
        int sum = 0;

        for (int i=0; i < lastIndex; i++)  {
            sum += num[i];
        }

        return sum;
    }
}