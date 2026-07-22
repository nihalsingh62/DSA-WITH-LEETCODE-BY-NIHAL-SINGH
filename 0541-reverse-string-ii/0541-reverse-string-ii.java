class Solution {
    public String reverseStr(String s, int k) {

        if (s.length() <= k) {
            return revv1(s);
        }

        return revv(s, k);
    }

    static String revv(String s, int k) {

        char[] shh = s.toCharArray();

        int n = shh.length;

        for (int left = 0; left < n; left += 2 * k) {

            int right = Math.min(left + k - 1, n - 1);

            int l = left;
            int r = right;

            while (l < r) {
                char temp = shh[l];
                shh[l] = shh[r];
                shh[r] = temp;
                l++;
                r--;
            }
        }

        return new String(shh);
    }

    static String revv1(String s) {

        char[] shh = s.toCharArray();

        int left = 0;
        int right = shh.length - 1;

        while (left < right) {
            char temp = shh[left];
            shh[left] = shh[right];
            shh[right] = temp;
            left++;
            right--;
        }

        return new String(shh);
    }
}