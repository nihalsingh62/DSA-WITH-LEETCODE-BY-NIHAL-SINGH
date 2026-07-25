class Solution {
    public int maxProduct(int n) {
        return maxmul(n);
        
    }static int maxmul(int n){
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for(int i = 0; i<arr.length;i++){
            arr[i] = s.charAt(i) - '0';
        }
        Arrays.sort(arr);
        int ni = arr[arr.length-1] * arr[arr.length-2];
        return ni;

    }
    
}