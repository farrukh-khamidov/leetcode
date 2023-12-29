package arrays_hashing.top_k_frequent_elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution3 {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        ArrayList[] counts = new ArrayList[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (counts[entry.getValue()] != null) {
                counts[entry.getValue()].add(entry.getKey());
            } else {
                counts[entry.getValue()]=new ArrayList<>(){{add(entry.getKey());}};
            }
        }
        int[] result = new int[k];
        for (int i = counts.length - 1, j = 0; i >= 0 && j < k; i--) {
            if (counts[i] != null) {
                for (Object i1 : counts[i]) {
                    result[j++] = (Integer) i1;

                }
            }
        }
        return result;
    }

    private void print(ArrayList[] counts) {

        for (ArrayList count : counts) {
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();

        int[] nums = {1, 2};
        int k = 2;
        print(solution.topKFrequent(nums, k));
    }

    static void print(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void print(Integer[] nums) {
        for (Integer num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
