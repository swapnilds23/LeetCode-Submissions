class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0 )
            return new ArrayList<>();
        Map<String, List<String>> groupAnagrams = new HashMap<>();
        for(String s:strs){
            char[] chars = s.toCharArray();
             Arrays.sort(chars);
           String currentWord = new String(chars);
            if(!groupAnagrams.containsKey(currentWord))
                groupAnagrams.put(currentWord, new ArrayList<>());
            
            groupAnagrams.get(currentWord).add(s);     
        }
        return new ArrayList<>(groupAnagrams.values());
    }
}