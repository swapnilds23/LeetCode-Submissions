class Solution {
    public boolean backspaceCompare(String s, String t) {
        return (getFinalString(s)).equals(getFinalString(t));
    }
    
    public String getFinalString(String str){
        Stack<Character> stack = new Stack<>();
        char [] stringChars = str.toCharArray();
        for(int i=0; i< stringChars.length; i++){
            if(stringChars[i] != '#' )
                stack.push(stringChars[i]);
            else if(!stack.isEmpty()) {
                stack.pop();
            }
        }
        
        
        return String.valueOf(stack);
    }
}