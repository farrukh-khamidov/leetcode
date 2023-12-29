package arrays_hashing.group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution2 {
    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] sNums = new int[26];
        for (char sC : s.toCharArray()) {
            sNums[sC - 'a']++;
        }
        int[] tNums = new int[26];
        for (char tC : t.toCharArray()) {
            tNums[tC - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (sNums[i] != tNums[i]) return false;
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList(strs));
        List<List<String>> result = new ArrayList<>();
        while (!list.isEmpty()) {
            List<String> group = new ArrayList<>();
            String first = list.removeFirst();
            group.add(first);
            for (String s : list) {
                if (isAnagram(first, s)) {
                    group.add(s);
                }
            }
            list.removeAll(group);
            result.add(group);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(solution.groupAnagrams(strs));
    }
}
