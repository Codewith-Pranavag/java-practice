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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        int i=0;
        while(temp!=null){
            i++;
            temp=temp.next;
        }
        int arr[]=new int[i];
        int k=0;
        int l=0;
        temp=head;
        while(temp!=null)
        {
            int data=temp.val;
            ListNode temp2=temp;
            boolean isfilled=false;
            while(temp2!=null){
                if(temp2.val>data){
                    arr[l++]=temp2.val;
                    isfilled=true;
                    break;
                }
                temp2=temp2.next;
            }
            if(!isfilled){
                arr[l++]=0;
            }
            temp=temp.next;
        }
        return arr;
    }
}
