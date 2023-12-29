package arrays_hashing.longest_consecutive_sequence;

import java.util.TreeSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int count = 1;
        int max = 0;
        int prev = 0;
        boolean first = true;
        for (Integer integer : set) {
            if(first){
                first = false;
            } else {
                if (integer == prev + 1) {
                    count++;
                } else {
                    if(count > max) max = count;
                    count = 1;
                }
            }
            prev = integer;
        }
        if(count > max) max = count;
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {100,4,200,1,3,2};
        System.out.println(solution.longestConsecutive(nums));
    }
}
