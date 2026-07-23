class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()){
            return false;
        }return revv(s,t);

        
    }static Boolean revv(String s ,String t){
        char[] sh = s.toCharArray();
        char[] shh = t.toCharArray();
        int left = sh.length-1;
        int right = shh.length-1;
        int count = 0;
        while(left!=-1 && right !=-1 ){
            if(sh[left] == shh[right]){
                count++;
                right--;
                left--;
            }else{
                right--;
            }
        }if(count == s.length()){
            return true;
        }else{
            return false;
        } 
    }
}