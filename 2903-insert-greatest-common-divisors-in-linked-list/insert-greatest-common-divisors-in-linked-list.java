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
        float divider = 1;
        if(a>b) { if(a%(float)b==0) return b; divider = b/2;}
        else{if(b%(float)a==0) return a; divider = a/2;}
        while(divider>1){
            if(a%divider == 0 && b%divider == 0 )
                return (int) divider;
            else divider--;
        }
        return 1;
    }
}