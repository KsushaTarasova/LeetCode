package problems.plus_one_66;

public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i > -1; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
