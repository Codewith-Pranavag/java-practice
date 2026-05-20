class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head=head.next;
            return head;
        }
        ListNode prev=head;
        int i=1;
        int itoFind=size-n;
        while(i<itoFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
}
