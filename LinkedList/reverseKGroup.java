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
    public ListNode getkthnode(ListNode temp,int k){
        k-=1;
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
       //finding kth node
       ListNode temp=head;
       ListNode prev=null;
       while(temp!=null){
        ListNode kthnode=getkthnode(temp,k);
        if(kthnode==null){
            if(prev!=null) prev.next=temp;
            break;
        }
        ListNode nextNode=kthnode.next;
        kthnode.next=null;
        reverse(temp);
        if(temp==head){
            head=kthnode;
        }
        else{
            prev.next=kthnode;
        }
        prev=temp;
        temp=nextNode;
       }
       return head;

    }
}
