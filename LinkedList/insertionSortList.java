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
    public ListNode insertionSortList(ListNode head) {
        int i=0;
        ListNode temp=head;
        while(temp!=null){
            i++;
            temp=temp.next;
        }
        int arr[]=new int[i];
       temp=head;
       for(int j=0;j<i;j++){
        arr[j]=temp.val;
        temp=temp.next;
       }
       Arrays.sort(arr);
       temp=head;
       i=0;
       while(temp!=null){
            temp.val=arr[i];
            temp=temp.next;
            i++;
        }
        return head;  
    }
}
