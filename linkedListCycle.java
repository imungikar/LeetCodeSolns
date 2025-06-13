/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.HashSet;

public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> spotted = new HashSet<ListNode>();
        while(head != null){
            if(spotted.contains(head)){
                return true;
            }
            spotted.add(head);
            head = head.next;
        }
        return false;
    }
}

//important to learn how one would do this in even less time
