package arrays_hashing.contains_duplicate;

import java.util.HashSet;

class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() != nums.length;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        int [] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(solution.containsDuplicate(nums));
    }
}
