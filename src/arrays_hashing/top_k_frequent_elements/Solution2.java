package arrays_hashing.top_k_frequent_elements;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution2 {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int[] result = new int[k];
        List<Integer> list = map.entrySet().stream().sorted((o1, o2) -> o2.getValue() - o1.getValue())
                .limit(k).map(Map.Entry::getKey).toList();
        int i = 0;
        for (Integer integer : list) {
            result[i++] = integer;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();

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
