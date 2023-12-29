package arrays_hashing.product_of_array_except_self;

class Solution {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;
        for (int num : nums) {
            product*=num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result[i] = product/nums[i];
            } else {
                int prd = 1;
                for (int j = 0; j < nums.length; j++) {
                    if (j == i) continue;
                    prd*=nums[j];
                }
                result[i] = prd;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1,1,0,-3,3};
        print(solution.productExceptSelf(nums));
    }

    static void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
