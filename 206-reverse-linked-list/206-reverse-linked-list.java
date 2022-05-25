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
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return head;
        Deque<ListNode> stack = new LinkedList<>();
        ListNode current = head;
        while(current.next != null){
            stack.push(current);
            current = current.next;
        }
        head = current;
        while(!stack.isEmpty()){
            current.next = stack.pop();
            current= current.next;
        }
        current.next =null;
        return head;
    }
}