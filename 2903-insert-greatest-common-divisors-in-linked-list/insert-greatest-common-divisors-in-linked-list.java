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
       return  b!=0 ?
                b>a ? gcd(a, b%a) : gcd(b, a%b)
                : a;
    }
}