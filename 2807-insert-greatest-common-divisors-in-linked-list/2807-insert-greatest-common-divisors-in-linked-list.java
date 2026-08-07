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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode dummy=head;
        while(dummy.next!=null){
            int g=gcd(dummy.val,dummy.next.val);
            ListNode h=new ListNode(g);
            ListNode h1=dummy.next;
            dummy.next=h;
            h.next=h1;
            dummy=dummy.next.next;
        }
        return head;
    }
    public int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}