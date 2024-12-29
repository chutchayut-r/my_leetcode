class Solution {
    public void moveZeroes(int[] nums) {
        int r_index = 0;
        int l_index = 0;

        for (l_index = 0; l_index< nums.length; l_index++) {

            if (nums[l_index] == 0) {
                for(r_index = l_index+1; r_index < nums.length; r_index++) {

                    if(nums[r_index] != 0) {
                        nums[l_index] = nums[r_index];
                        nums[r_index] = 0;
                        break;
                    }

                }
            }

        }

    }
}