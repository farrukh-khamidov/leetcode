package arrays_hashing.product_of_array_except_self;

class Solution3 {

    public int[] productExceptSelf(int[] nums) {
        int[] prefixProduct = new int[nums.length];
        int[] suffixProduct = new int[nums.length];
        prefixProduct[0] = 1;
        suffixProduct[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefixProduct[i] = prefixProduct[i-1] * nums[i-1];
            suffixProduct[nums.length - 1 - i] = suffixProduct[nums.length - i] * nums[nums.length -i];
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefixProduct[i] * suffixProduct[i];
        }
        return result;
    }


    public static void main(String[] args) {
        Solution3 solution = new Solution3();
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
