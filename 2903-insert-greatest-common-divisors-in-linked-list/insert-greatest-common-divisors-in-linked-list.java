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
            ListNode nextNode = head.next;
            int v1 =head.val; int v2 = nextNode.val;
            ListNode newNode = new ListNode();
            newNode.val = (v1 < v2) ? gcd(v1,v2) : gcd(v2,v1);
            newNode.next = head.next;
            head.next = newNode;
            head = nextNode; 
        }
        return firstNode;
    }
    public int gcd(int a, int b){
        int divider = a;
        while(divider>1){
            if((float) a%divider == 0 && (float) b%divider == 0 )
                return divider;
            else divider--;
        }
        return divider;
    }
}