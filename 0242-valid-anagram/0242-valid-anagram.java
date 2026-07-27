class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }else if(ana(s).equals(anas(t))){
            return true;
        }else{
            return false;
        }
        
    }static HashMap<Character,Integer> ana(String s){
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }return map;

    }static HashMap<Character,Integer> anas(String t){
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<t.length();i++){
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }return map;

    }

}