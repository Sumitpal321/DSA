class Solution {
    public Node flatten(Node head) {
        Node curr = head;
        while(curr!=null){
            Node Next = curr.next;
            if(curr.child!=null){
                Node c = flatten(curr.child);
                Node d = c;
                while(d.next != null){
                    d = d.next;
                }
                curr.next = c; c.prev = curr;
                d.next = Next;
                if(Next != null) Next.prev = d;
                curr.child = null;
            }
            curr = Next;
        }
        return head;
    }
}