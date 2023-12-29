package arrays_hashing.group_anagrams;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Solution5 {

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
        char[] eachCount = new char[26];
        for (char c : chars) {
            eachCount[c-'a']++;
        }
        return new String(eachCount);
    }

    public static void main(String[] args) {
        Solution5 solution = new Solution5();

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(solution.groupAnagrams(strs));
    }
}
