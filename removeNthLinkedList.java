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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currCount = head;
        int currentNodes = 0;
        while(currCount != null){
            currentNodes = currentNodes + 1;
            currCount = currCount.next;
        }
        ListNode prev = null;
        ListNode curr = head;
        if(n == currentNodes){
            return head.next;
        }
        int num = currentNodes - n;
        int count = 0;
        while(curr != null){
            if(count == num && count == 0){
                head = curr.next;
            }
            if(count == num){
                prev.next = curr.next;
            }
            prev = curr;
            curr = curr.next;
            count = count + 1;
        }   
        return head;
    }
}
