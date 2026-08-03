class Solution {
    public int totalFruit(int[] fruits) {
        return hm(fruits);
        
    }
    static int hm(int[] ch){
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;
        for(int i = 0; i < ch.length ; i++){
            int freq = 0;
            map.put(ch[i],map.getOrDefault(ch[i],0) + 1);
            while(map.size() > 2){
                map.put(ch[left],map.get(ch[left]) - 1);
                if (map.get(ch[left]) == 0) {
                    map.remove(ch[left]);
                }
                
                left++;
                
            }max = Math.max(max,i-left+1);
        }return max;
    }
}