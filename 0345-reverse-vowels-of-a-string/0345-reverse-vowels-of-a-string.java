class Solution {
    public String reverseVowels(String s) {
        char[] shh = s.toCharArray();


        return reverse(shh);
    }

    static String reverse(char[] shh) {
        int left = 0;
        int right = shh.length - 1;

        while (left < right) {

            while (left < right && !isVowel(shh[left])) {
                left++;
            }

            while (left < right && !isVowel(shh[right])) {
                right--;
            }

            if (left < right) {
                char temp = shh[left];
                shh[left] = shh[right];
                shh[right] = temp;

                left++;
                right--;
            }
        }return new String(shh);
    }

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'A' ||
               ch == 'e' || ch == 'E' ||
               ch == 'i' || ch == 'I' ||
               ch == 'o' || ch == 'O' ||
               ch == 'u' || ch == 'U';
    }
}