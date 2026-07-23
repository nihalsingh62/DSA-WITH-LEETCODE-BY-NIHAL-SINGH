class Solution {

    public boolean validPalindrome(String s) {
        return checkPalindrome(s, 0, s.length() - 1);
    }

    static boolean checkPalindrome(String s, int left, int right) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {

                // Try deleting left character
                return isPalindrome(s, left + 1, right)
                        || isPalindrome(s, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    static boolean isPalindrome(String s, int left, int right) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}