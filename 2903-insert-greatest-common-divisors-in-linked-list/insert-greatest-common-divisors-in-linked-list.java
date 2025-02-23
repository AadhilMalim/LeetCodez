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
        ListNode firstNode = head;
        while(head.next != null){
            head.next = new ListNode(gcd(head.val, head.next.val), head.next);
            head = head.next.next; 
        }
        return firstNode;
    }
    public int gcd(int a, int b){
        if(a>b) {int c=b;b=a;a=c;}
        if(b%(float)a == 0) return a;
        int divider = a/2;
        while(divider>1){
            if((float) a%divider == 0 && (float) b%divider == 0 )
                return divider;
            else divider--;
        }
        return 1;
    }
}