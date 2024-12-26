func moveZeroes(nums []int) {
	length := len(nums)

	for k := 0; k < length-1/2; k++ {
		for i := 0; i < length-1; i++ {
			if nums[i] == 0 && nums[i+1] != 0 {
				nums[i] = nums[i+1]
				nums[i+1] = 0
			}
		}
	}
}