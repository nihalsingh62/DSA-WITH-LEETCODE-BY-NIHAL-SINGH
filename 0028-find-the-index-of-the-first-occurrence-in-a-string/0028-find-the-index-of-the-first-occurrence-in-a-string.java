class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }

        return tp(haystack, needle);
    }

    static int tp(String haystack, String needle) {

        char[] s = haystack.toCharArray();
        char[] si = needle.toCharArray();

        int left = 0;

        while (left <= s.length - si.length) {

            int right = left + 1;
            int sleft = 0;
            int sright = 1;
            int count = 0;

            if (s[left] == si[sleft]) {

                while (sright < si.length) {

                    if (s[right] == si[sright]) {
                        count++;
                        right++;
                        sright++;
                    } else {
                        break;
                    }
                }

                if (count == si.length - 1) {
                    return left;
                }
            }

            left++;
        }

        return -1;
    }
}