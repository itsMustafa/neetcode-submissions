class Solution {
    public boolean isValid(String s) {
        Stack<Character> seen = new Stack<>();
        char[] sChars = s.toCharArray();

        // pushing opposite bracket into stack saves the match logic
        for(char ch: sChars) {
            if (ch == '{')
                seen.push('}');
            else if (ch == '[')
                seen.push(']');
            else if (ch == '(')
                seen.push(')');
            else if (seen.isEmpty() || seen.pop() != ch) {
                return false;
            }
            
        }
        
        return seen.isEmpty();
    }
}
