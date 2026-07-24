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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l1;
        if(l2==null) return l2;
        ListNode current=new ListNode(-1);
        ListNode last=current;
        int c=0;
        while(l1!=null || l2!=null || c!=0){
            int x= (l1!=null) ? l1.val : 0;
            int y= (l2!=null) ? l2.val : 0;
            int sum=x+y+c;
            int d=sum%10;
            c=sum/10;
            ListNode new_node=new ListNode(d);
            current.next=new_node;
            current=current.next;
            l1=(l1!=null) ? l1.next : null;
            l2=(l2!=null) ? l2.next : null;
        }

        return last.next;
    }
}