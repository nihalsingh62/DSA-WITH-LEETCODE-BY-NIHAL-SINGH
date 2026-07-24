class Solution {
    public boolean validPalindrome(String s) {
       return paliii(s,0,s.length() -1 ); 

        
    }static boolean paliii(String s,int left,int right){
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return ispal(s,left+1,right) || ispal(s,left,right-1);
            }
            left++;
            right--;

        }
        return true;
    }
    static boolean ispal(String s,int left,int right){
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }return true;

    }
}