class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int [] countAlphabet = new int[26];
        for(int i=0; i<s.length();i++){
            countAlphabet[s.charAt(i)-'a']++;
        }
        for(int j=0; j<t.length();j++){
            countAlphabet[t.charAt(j)-'a']--;
        }
        for(int k=0; k<countAlphabet.length; k++ ){
            if(countAlphabet[k] !=0)
                return false;
        }
        return true;
    }
}