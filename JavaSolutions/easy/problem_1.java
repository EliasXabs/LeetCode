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
        // 0ms solution
        // 45.5 MB
        Map<Integer, Integer> hash = new HashMap<>();

        for (int i = 0, j = nums.length - 1; i < nums.length / 2 && j >= nums.length + 1 / 2; i++, j--) {

            if (hash.containsKey(target - nums[i])) {
                return new int[] { i, hash.get(target - nums[i]) };
            }
            hash.put(nums[i], i);
            if (hash.containsKey(target - nums[j])) {
                return new int[] { j, hash.get(target - nums[j]) };
            }
            hash.put(nums[j], j);

        }
        return new int[] { -1, -1 };
    }

    // main method
    public static void main(String[] args) {
        problem_1 solution = new problem_1();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}