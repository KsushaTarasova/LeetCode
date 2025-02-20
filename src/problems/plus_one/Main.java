package problems.plus_one;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] digits = new int[]{0};
        int[] result = solution.plusOne(digits);
        for (int j : result) {
            System.out.println(j);
        }
    }
}
