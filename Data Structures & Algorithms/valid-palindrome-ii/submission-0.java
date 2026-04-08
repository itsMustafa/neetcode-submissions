class Solution {
    public boolean validPalindrome(String s) {
        char[] ch = s.toCharArray();
        int left = 0, right = ch.length - 1;

        while(left < right) {
            if (ch[left] != ch[right]) {
                // if any both pointers have different value, check if ignoring either 
                // will have valid palindrome string, by passing the substring 2 times
                // first ignoring left then right and if either of them is valid then is a valid string
                return isValidPalindrome(ch, left + 1, right) || isValidPalindrome(ch, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    private boolean isValidPalindrome(char[] ch, int left, int right) {
        while(left < right) {
            if(ch[left] != ch[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}