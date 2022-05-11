class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPair =0;
        Map<Integer,Integer> indexMap = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            indexMap.put(nums[i], indexMap.getOrDefault(nums[i], 0)+1);
            goodPair += indexMap.get(nums[i])-1;
        }
        return goodPair;
    }
}