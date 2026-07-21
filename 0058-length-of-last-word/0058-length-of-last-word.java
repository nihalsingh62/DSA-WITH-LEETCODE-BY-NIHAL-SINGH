class Solution {
    public int lengthOfLastWord(String s) {
        return lastindexcount(s);
        
    }static int lastindexcount(String s){
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
        
    }
}