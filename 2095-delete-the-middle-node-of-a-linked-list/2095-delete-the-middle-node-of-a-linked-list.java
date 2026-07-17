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
    public ListNode deleteMiddle(ListNode head) {
        int count=0, mid=0;
        ListNode h1=head;
        ListNode h2=head;
        while(h1!=null){
            count++;
            h1=h1.next;
        }
        mid=count/2;
        if(mid==0) return null;
        for(int i=0;i<mid-1;i++){
            h2=h2.next;
        }
        h2.next=h2.next.next;
        return head;
    }
}