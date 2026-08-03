class Solution {
    public int minimumRecolors(String blocks, int k) {
        return sw(blocks,k);
        
    }static int sw(String b,int k){
        StringBuilder nya = new StringBuilder();
        for(int i = 0; i<k;i++){
            nya.append("B");
        }
        String sb = nya.toString();
        if(b.contains(sb)){
            return 0;
        }
        int count = 0;
        for(int i = 0; i <k;i++){
            char ch = b.charAt(i);
            if(ch == 'W'){
                count++;
            }
        }
        int min = count;
        for(int i = k;i<b.length();i++){
            if(b.charAt(i-k) == 'W'){
                count--;
            }if(b.charAt(i) == 'W'){
                count++;
            }
            min = Math.min(min,count);
        }return min;

    }
}