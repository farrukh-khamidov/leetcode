package arrays_hashing.valid_anagram;

class Solution {
    public boolean isAnagram(String s, String t) {
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

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "rat", t = "car";
        System.out.println(solution.isAnagram(s, t));
    }
}
