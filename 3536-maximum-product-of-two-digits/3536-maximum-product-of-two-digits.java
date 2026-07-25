class Solution {
    public int maxProduct(int n) {
        return maxmul(n);
        
    }static int maxmul(int n){
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for(int i = 0; i<arr.length;i++){
            arr[i] = s.charAt(i) - '0';
        }
        int left = 0;
        int maxss = Integer.MIN_VALUE;
        while(left!= arr.length){
            int right = left+1;
            while(right != arr.length){
                int ps = arr[left]*arr[right];
                if(ps>maxss){
                    maxss= ps;
                }right++;
            }left++;
        }return maxss;

    }
    
}