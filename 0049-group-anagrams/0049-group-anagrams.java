import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        return gp(strs);
    }

    static List<List<String>> gp(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];

            int[] freq = new int[26];

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                freq[c - 'a']++;
            }

            String key = Arrays.toString(freq);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}