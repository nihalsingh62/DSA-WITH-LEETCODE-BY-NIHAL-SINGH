class Solution {
    public int countValidPrefixes(String s) {
        return freq(s);
        
        
    }static int freq(String s){
        int zeros = 0;
        int ones = 0;
        int answer = 0;
        
        
        for(int i = 0; i< s.length() ;i++){
   
            if(s.charAt(i) == '0'){
                zeros++;
                
            }else{
                ones++;
                
            }
            
            if(Math.abs( ones - zeros) <= 1){
                answer++;
            }
            
        }return answer;
    }
}