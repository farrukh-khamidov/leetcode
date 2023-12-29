package arrays_hashing.contains_duplicate;

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int [] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(solution.containsDuplicate(nums));
    }
}
