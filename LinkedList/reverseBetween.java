class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right ) return head;
        ListNode dummy=new ListNode (0);
        dummy.next=head;
        ListNode leftside=dummy;
        for(int i=1;i<left;i++){
            leftside=leftside.next;
        }
        ListNode leftl=leftside.next;
        ListNode rside =leftl;
        for(int i=left;i<right;i++){
            rside=rside.next;
        }
        ListNode afterright=rside.next;
        ListNode prev=afterright;
        ListNode curr=leftl;
        ListNode next;
        while(curr!=afterright){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        leftside.next=prev;
        return dummy.next;        
    }
}
