package problems.length_of_last_word_58;

public class Solution {
    public int lengthOfLastWord(String s) {
        String trim = s.trim();
        String[] split = trim.split(" ");
        return split[split.length - 1].length();
    }
}
