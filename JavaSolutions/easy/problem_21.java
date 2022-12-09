package JavaSolutions.easy;

import JavaSolutions.ListNode;

public class problem_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        ListNode current1 = list1;
        ListNode previous = null;
        ListNode current2 = list2;

        while (current1 != null && current2 != null) {
            if (current1.val <= current2.val) {
                if (current1.next == null) {
                    current1.next = current2;
                    return list1;
                }
                previous = current1;
                current1 = current1.next;
            } else {

                if (previous == null) {
                    previous = current2;
                    current2 = current2.next;
                    list1 = previous;
                    previous.next = current1;
                } else {
                    previous.next = current2;
                    if (current2.next == null) {
                        current2.next = current1;
                        return list1;
                    }
                    previous = current2;
                    current2 = current2.next;
                    previous.next = current1;
                }
            }
        }
        return list1;
    }

    // main method
    public static void main(String[] args) {
        problem_21 solution = new problem_21();
        ListNode list1 = new ListNode(5);
        ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode mergedList = solution.mergeTwoLists(list1, list2);
        while (mergedList != null) {
            System.out.println(mergedList.val);
            mergedList = mergedList.next;
        }
    }
}
