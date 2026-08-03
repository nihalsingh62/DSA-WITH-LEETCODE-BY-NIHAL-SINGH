class Solution {
    public int maxVowels(String s, int k) {
        return vow(s, k);
    }

    static int vow(String s, int k) {
        int count = 0;

        for (int i = 0; i < k; i++) {
            if (vowels(s.charAt(i))) {
                count++;
            }
        }

        int max = count;

        for (int i = k; i < s.length(); i++) {

            // Remove left character
            if (vowels(s.charAt(i - k))) {
                count--;
            }

            // Add right character
            if (vowels(s.charAt(i))) {
                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }

    static boolean vowels(char ch) {
        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }
}