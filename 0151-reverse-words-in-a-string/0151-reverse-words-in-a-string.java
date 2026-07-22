class Solution {
    public String reverseWords(String s) {
        return revv(s);
        
    }static String revv(String s ){
        String[] shh = s.trim().split("\\s+");
        int left = 0;
        int right = shh.length-1;
        while(left<right){
            String temp = shh[left];
            shh[left] = shh[right];
            shh[right] = temp;
            left++;
            right--;

        }String sh = String.join(" ", shh);
        return sh;
    }
}