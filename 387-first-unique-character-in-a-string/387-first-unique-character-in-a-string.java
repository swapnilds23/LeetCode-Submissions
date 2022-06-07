class Solution {
    public int firstUniqChar(String s) {
        int uniqueCharIndex = -1;
        int [] charCount = new int[26];
        for(int i=0;i<s.length();i++){
            charCount[s.charAt(i)-'a'] +=1 ;
        }
        for(int j=0; j<s.length(); j++){
            if(charCount[s.charAt(j)-'a']==1){
                uniqueCharIndex = j;
                break;
            }
          
        }
        return uniqueCharIndex;
    }
}