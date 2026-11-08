/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }
    public ListNode doubleIt(ListNode head) {
        head=reverse(head);
        ListNode temp=head;
        int carry=0;
        while(temp!=null){
            temp.val=temp.val*2+carry;
            if(temp.val<10){
                carry=0;
            }
            else{
                temp.val=temp.val%10;
                carry=1;
            }
            temp=temp.next;
        }
        if(carry==1){
            ListNode n=new ListNode(1);
            head=reverse(head);
            n.next=head;
            return n;
        }
        head=reverse(head);
        return head;
    }
}
