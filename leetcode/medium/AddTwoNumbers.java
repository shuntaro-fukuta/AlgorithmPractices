package medium;

// https://leetcode.com/problems/add-two-numbers/

public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumListNode = new ListNode(0);

        ListNode digitSumListNode = sumListNode;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int tmpl1 = (l1 == null) ? 0 : l1.val;
            int tmpl2 = (l2 == null) ? 0 : l2.val;

            int digitSum = tmpl1 + tmpl2 + carry;
            boolean isDigitSumOneDigit = String.valueOf(digitSum).length() == 1;

            int addNumber = 0;
            if (isDigitSumOneDigit) {
                addNumber = digitSum;
                carry = 0;
            } else {
                addNumber = Character.getNumericValue(String.valueOf(digitSum).charAt(1));
                carry = Character.getNumericValue(String.valueOf(digitSum).charAt(0));
            }

            digitSumListNode.next = new ListNode(addNumber);
            digitSumListNode = digitSumListNode.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry != 0) digitSumListNode.next = new ListNode(carry);

        return sumListNode.next;
    }
}

