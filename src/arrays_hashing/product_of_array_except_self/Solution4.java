 package arrays_hashing.product_of_array_except_self;

class Solution4 {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int prePost = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prePost;
            prePost *= nums[i];
        }
        prePost = 1;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            result[i] = result[i] * prePost;
            prePost*=nums[i];
        }
        return result;
    }


    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        int[] nums = {1,2,3,4,5};
        print(solution.productExceptSelf(nums));
    }

    static void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
