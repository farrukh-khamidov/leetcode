package arrays_hashing.top_k_frequent_elements;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        return map.entrySet().stream().sorted((o1, o2) -> o2.getValue() - o1.getValue())
                .limit(k).mapToInt(Map.Entry::getKey).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        print(solution.topKFrequent(nums, k));
    }

    static void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
