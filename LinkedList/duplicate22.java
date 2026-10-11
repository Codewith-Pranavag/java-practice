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
    public ListNode deleteDuplicates(ListNode head) {
        int arr[]=new int[201];
        ListNode temp=head;
        while(temp!=null){
            arr[temp.val+100]++;
            temp=temp.next;
        }
        ListNode dummy=new ListNode (0);
        ListNode prev=dummy;
        temp=head;
        while(temp!=null){
            if(arr[temp.val+100]==1){
                prev.next=temp;
                prev=temp;
            }
            temp=temp.next;
        }
        prev.next=null;
        return dummy.next;

    }
}
