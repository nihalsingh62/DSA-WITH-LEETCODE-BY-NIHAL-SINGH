class Solution {

    public boolean backspaceCompare(String s, String t) {

        String s1 = process(s);
        String t1 = process(t);

        if (s1.equals(t1)) {
            return true;
        }

        return false;
    }

    public String process(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '#') {

                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }

            } else {

                sb.append(ch);

            }
        }

        return sb.toString();
    }
}