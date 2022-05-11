class Solution {
    public int[] runningSum(int[] nums) {
        int currentSum = nums[0];
        for(int i=1; i<nums.length; i++){
            nums[i] = currentSum + nums[i];
            currentSum = nums[i];
        }
        return nums;
    }
}