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
    public ListNode middleNode(ListNode head) {
        ListNode[] arr = new ListNode[100];
        
        int ind = 0;
        while (head != null) {
            arr[ind++] = head;
            head = head.next;
        }
        return arr[ind/2];
    }
}