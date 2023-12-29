package arrays_hashing.group_anagrams;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Solution4 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String eachCount = getEachCount(str);
            if (map.containsKey(eachCount)) {
                map.get(eachCount).add(str);
            } else {
                LinkedList<String> list = new LinkedList<>();
                list.add(str);
                map.put(eachCount, list);
            }
        }
        return map.values().stream().toList();
    }
    private String getEachCount(String str) {
        char[] chars = str.toCharArray();
        int[] eachCount = new int[26];
        for (char c : chars) {
            eachCount[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < eachCount.length; i++) {
            if (eachCount[i] > 0) {
                sb.append(i + 'a').append(eachCount[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution4 solution = new Solution4();

        String[] strs = {"abbbbbbbbbbb","aaaaaaaaaaab"};
        System.out.println(solution.groupAnagrams(strs));
    }
}
