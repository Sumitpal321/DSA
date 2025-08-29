class Solution {
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr =head;
        while(curr!=null){
            ListNode Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return ;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null &&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = reverseList(slow.next);
        slow.next = null;
        ListNode dummy = new ListNode(-1);
        ListNode first = head;
        ListNode temp = dummy;
        while(first!=null && second!=null){
            temp.next = first;
            first = first.next;
            temp = temp.next;

            temp.next = second;
            second = second.next;
            temp = temp.next;
        }
        if(first!=null) temp.next = first;
        if(second!=null) temp.next = second;

    }
}