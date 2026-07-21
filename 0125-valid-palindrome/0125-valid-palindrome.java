class Solution {
    public boolean isPalindrome(String s) {
        return palll(s);
        
    }static boolean palll(String s){
        StringBuilder shhh = new StringBuilder(s.toLowerCase().replaceAll("[^a-z0-9]",""));
        if(s == null || s == ""){
            return true;
        }
        for (int i = 0; i < shhh.length() / 2; i++) {
            char ss = shhh.charAt(i);
            char pp = shhh.charAt(shhh.length() - 1 - i);
            if(ss != pp){
                return false;
            }
        }return true;

    }
}