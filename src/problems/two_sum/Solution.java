package problems.two_sum;


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (seen.get(diff) != null) {
                return new int[]{seen.get(diff), i};
            } else {
                seen.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
