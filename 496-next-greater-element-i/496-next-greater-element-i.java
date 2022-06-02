class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //Create a map to store the next greater element of num
        Map<Integer, Integer> elements = new HashMap<>();
        // Create a stack that will maintain the next greater element at peek
        Stack<Integer> stack= new Stack<>();
        
        //Iterate over nums2 to find next greater element for each number in an array.
        for(int i=0; i< nums2.length; i++){
            while(!stack.isEmpty() && stack.peek()< nums2[i]){
                elements.put(stack.pop(), nums2[i]); }
            stack.push(nums2[i]);
        }
        for(int j=0; j<nums1.length; j++){
            nums1[j] = elements.getOrDefault(nums1[j], -1);
        }
     return nums1;
    }
}