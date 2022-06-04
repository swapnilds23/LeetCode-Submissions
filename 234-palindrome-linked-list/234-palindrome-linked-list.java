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
//User slow and fast pointer method.
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverseList(slow);
        fast = head;
        while(slow != null){
            if(slow.val != fast.val)
                return false;
            slow= slow.next;
            fast= fast.next;
        }
        return true;
    }
    
    public ListNode reverseList(ListNode start){
        ListNode prev = null;
        while(start != null){
            ListNode nextNode = start.next;
            start.next = prev;
            prev = start;
            start = nextNode;
        }
        return prev;
    }
}