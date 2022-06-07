class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        char [] ch = s.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i] == '(' || ch[i] == '{' ||ch[i] == '[')
                stack.push(ch[i]);
            else if((ch[i] == ')' && !stack.isEmpty() && stack.peek() == '(') || (ch[i] == '}' && !stack.isEmpty() && stack.peek() == '{') || (ch[i] == ']' && !stack.isEmpty() && stack.peek() == '[')){
                  stack.pop();
                
            }
            else 
                return false;
              
        }
        
        return stack.isEmpty();
    }
}