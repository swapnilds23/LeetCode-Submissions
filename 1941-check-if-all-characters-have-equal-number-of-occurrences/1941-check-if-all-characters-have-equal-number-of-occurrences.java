class Solution {
    public boolean areOccurrencesEqual(String s) {
        int count[] = new int[26];
        
        for(int i=0; i<s.length();i++){
            int index = s.charAt(i) -'a';
            count[index]+=1;
        }
        
        int maxOccurrence = count[s.charAt(0)-'a'];
        
        for(int j=0; j<count.length; j++){
            if(count[j] != 0 && count[j] != maxOccurrence)
                return false;
        }
        return true;
    }
}