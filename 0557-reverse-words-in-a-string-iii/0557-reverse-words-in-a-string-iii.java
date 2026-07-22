class Solution {
    public String reverseWords(String s) {
        return revv(s);
        
    }static String revv(String s ){
        char[] shh = s.toCharArray();
        int left = 0;
        for (int i = 0; i < shh.length; i++) {
            if(shh[i] == ' '){
                int right = i - 1;
                while(left < right){
                    char temp = shh[left];
                    shh[left] = shh[right];
                    shh[right] = temp;
                    left++;
                    right--;
                }left = i + 1;
            }
        }int right = shh.length - 1;
        while(left<right){
            char temp = shh[left];
            shh[left] = shh[right];
            shh[right] = temp;
            left++;
            right--;
        }
        return new String(shh);
    }
}