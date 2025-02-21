package problems.remove_duplicates_from_sorted_list_83;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode govno = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode result = solution.deleteDuplicates(govno);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
