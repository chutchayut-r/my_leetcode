class Solution {
    public void moveZeroes(int[] nums) {

        for (int index = 0; index < nums.length-1; index++) {
            for (int index1 = 0; index1 < nums.length-1; index1++) {
                if (nums[index1] == 0) {
                    if (nums[index1 + 1] != 0){
                        nums[index1] = nums[index1+1];
                        nums[index1+1] = 0;
                    }
                }
            }
        }

    }
}