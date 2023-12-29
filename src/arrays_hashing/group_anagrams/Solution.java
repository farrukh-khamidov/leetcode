package arrays_hashing.group_anagrams;

import java.util.*;

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> map = new HashMap<>();
        for (String str : strs) {
            List<Integer> eachCount = getEachCount(str);
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
    private List<Integer> getEachCount(String str) {
        char[] chars = str.toCharArray();
        Integer[] eachCount = new Integer[26];
        Arrays.fill(eachCount, 0);
        for (char c : chars) {
            eachCount[c-'a']++;
        }
        return Arrays.asList(eachCount);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(solution.groupAnagrams(strs));
    }
}
