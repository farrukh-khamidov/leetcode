package arrays_hashing.group_anagrams;

import java.util.*;

class Solution3 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String sortedCopy = getSortedCopy(str);
            if (map.containsKey(sortedCopy)) {
                map.get(sortedCopy).add(str);
            } else {
                LinkedList<String> list = new LinkedList<>();
                list.add(str);
                map.put(sortedCopy, list);
            }
        }
        return map.values().stream().toList();
    }

    private String getSortedCopy(String str) {
        char[] tempArray = str.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(solution.groupAnagrams(strs));
    }
}
