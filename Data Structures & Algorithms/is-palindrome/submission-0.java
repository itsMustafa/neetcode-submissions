class Solution {
    public boolean isPalindrome(String s) {
        // Sanitize the input
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        char[] sChars = s.toCharArray();
        int left = 0;
        int right = sChars.length - 1;

        // loop until both indexes collides
        while(left < right) {
            // if first and last elements does not match return false
            if (sChars[left] != sChars[right]) {
                return false;
            }
            left++;
            right--;
        }

        // string is a palindrome
        return true;

    }
}
