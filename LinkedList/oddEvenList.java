class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode prev=head;
        if(head==null){
            return head;
        }
        ListNode  curr=prev.next;
        ListNode head2=curr;
        while(curr!=null && curr.next!=null){
            prev.next=curr.next;
            prev=prev.next;
            curr.next=prev.next;
            curr=curr.next;
        }
        prev.next=head2;
        return head;
        
    }
}
