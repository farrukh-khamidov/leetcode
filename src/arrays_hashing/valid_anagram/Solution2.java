package arrays_hashing.valid_anagram;

class Solution2 {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        int[] sNums = new int[26];
        for (char sC : sChars) {
            sNums[sC - 'a']++;
        }

        char[] tChars = t.toCharArray();
        int[] tNums = new int[26];
        for (char tC : tChars) {
            tNums[tC - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (sNums[i] != tNums[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        String s = "rat", t = "car";
        System.out.println(solution.isAnagram(s, t));
    }
}
