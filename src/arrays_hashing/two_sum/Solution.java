package arrays_hashing.two_sum;

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        int[] result = new int[2];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            int num2 = target - nums[i];
            if (num2 != nums[i]) {
                set.add(num2);
            } else {
                result[j++] = i;
                count++;
            }
        }
        if (count == 2) {
            return result;
        }
        Arrays.fill(result, 0);
        j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                result[j++] = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int [] nums = {5,3,9,3};
        int target = 6;
        print(solution.twoSum(nums, target));
    }
    static void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
