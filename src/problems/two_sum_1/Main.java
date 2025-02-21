package problems.two_sum_1;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{3, 3};
        int target = 6;
        int[] result = solution.twoSum(nums, target);
        for (int j : result) {
            System.out.println(j);
        }
    }
}
