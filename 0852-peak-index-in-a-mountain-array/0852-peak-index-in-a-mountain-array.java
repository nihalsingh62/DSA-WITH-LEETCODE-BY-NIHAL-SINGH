class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return bs(arr);
        
    }static int bs(int[] arr){
        int left = 0;
        int pm = 0;
        int min = Integer.MIN_VALUE;
        while(left != arr.length-1){
            
            if(min<arr[left]){
                min = arr[left];
                pm = left;
                left++;
            }else{
                left++;
            }
        }return pm;
    }
}