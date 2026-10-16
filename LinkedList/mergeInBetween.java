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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode l=list1;
        ListNode temp1=list1;
        int i=0;
        while(i<a-1){
            temp1=temp1.next;
            i++;
        }
        ListNode temp2=list1;
        i=0;
        while(i<=b){
            temp2=temp2.next;
            i++;
        }
        temp1.next=list2;
        while(list2.next!=null){
            list2=list2.next;
        }
        list2.next=temp2;
        return l;


        
    }
}
