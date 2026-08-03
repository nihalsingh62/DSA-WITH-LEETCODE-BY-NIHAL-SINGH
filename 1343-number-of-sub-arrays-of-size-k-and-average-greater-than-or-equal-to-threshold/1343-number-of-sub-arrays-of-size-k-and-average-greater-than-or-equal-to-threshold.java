class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        return kt(arr,k,threshold);
        
    }static int kt(int[] arr, int k, int t){
        int sum = 0;
        int count = 0;
        for(int i = 0; i< k ;i++){
            sum += arr[i];

        }
        if(av(sum,k)>=t){
            count++;
        }
        for(int i = k;i<arr.length;i++){
            sum = sum + arr[i] - arr[i-k];
            if((sum / k) >= t){
                count++;
            }
        }return count;


    }static int av(int sum,int k){
        int ave = sum / k ;
        return ave;
    }
}