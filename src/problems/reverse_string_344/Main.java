package problems.reverse_string_344;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] s = new char[]{'H','a','n','n','a','h'};
        solution.reverseString(s);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }
}
