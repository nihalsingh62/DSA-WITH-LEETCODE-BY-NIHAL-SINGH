class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }return freq(s1,s2);
        
    }static boolean freq(String s1, String s2){
        int[] freq = new int[26];
        for(int i = 0; i<s1.length();i++){
            char c = s1.charAt(i);
            freq[c-'a']++;
        }
        int[] freqi = new int[26];
        for(int i = 0; i<s1.length();i++){
            char c = s2.charAt(i);
            freqi[c-'a']++;
        }if(Arrays.equals(freq,freqi)){
            return true;
        }for(int start = s1.length();start < s2.length();start++){
            char c = s2.charAt(start);
            char ci = s2.charAt(start - s1.length());
            freqi[c-'a']++;
            freqi[ci-'a']--;
            if(Arrays.equals(freq,freqi)){
                return true;
            }
        }return false;

    }
}