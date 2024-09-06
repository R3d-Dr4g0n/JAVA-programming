public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(-1);
    ListNode current = dummy;

    while (l1 != null && l2 != null) {
        if (l1.value < l2.value) {
            current.next = l1;
            l1 = l1.next;
        } else {
            current.next = l2;
            l2 = l2.next;
        }
        current = current.next;
    }
    current.next = (l1 != null) ? l1 : l2;

    return dummy.next;
}
