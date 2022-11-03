package JavaSolutions.easy;

import java.util.HashMap;
import java.util.Map;

public class problem_1 {

    /*
     * Given an array of integers nums and an integer target, return indices of the
     * two numbers such that they add up to target.
     * 
     * You may assume that each input would have exactly one solution, and you may
     * not use the same element twice.
     * 
     * You can return the answer in any order.
     */

    public int[] twoSum(int[] nums, int target) {
        // 5ms solution
        // 45.5 MB
        Map<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(target - nums[i])) {
                return new int[] { i, hash.get(target - nums[i]) };
            } else {
                hash.put(nums[i], i);
            }
        }
        return new int[] { -1, -1 };
    }
}