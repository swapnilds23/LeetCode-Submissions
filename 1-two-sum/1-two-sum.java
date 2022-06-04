class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> visited = new HashMap<>();
        int [] result = new int[2];
        for(int i=0; i<nums.length; i++){
            if(visited.containsKey(target - nums[i]) ){
                result[0] = visited.get(target - nums[i]);
                result[1] = i;
            }
            visited.put(nums[i], i);
        }
        return result;
    }
}