class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int digit = n;
            int ans = 1;

            while(digit>0){
                int rem = digit % 10;
                ans = ans*rem;
                digit = digit / 10;
            }if(ans % t == 0){
                return n;
            }n++;
        }
    }
}