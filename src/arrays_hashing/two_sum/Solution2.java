package arrays_hashing.two_sum;

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] + nums[i] == target) return new int[] {j, i};
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        int [] nums = {3,3};
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
