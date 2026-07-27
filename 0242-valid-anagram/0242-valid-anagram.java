class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }return ana(s,t);
        
    }static boolean ana(String s,String t){
        char[] si = s.toCharArray();
        Arrays.sort(si);
        char[] sii = t.toCharArray();
        Arrays.sort(sii);
        for(int i = 0;i<si.length;i++){
            if(si[i] != sii[i]){
                return false;
            }
        }return true;
    }

}