package problems.find_maximum_number_of_string_pairs_2744;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> set = new HashSet<>();
        int count = 0;
        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word);
            if (set.contains(reversed.reverse().toString())) {
                count++;
            } else {
                set.add(word);
            }
        }
        return count;
    }
}
