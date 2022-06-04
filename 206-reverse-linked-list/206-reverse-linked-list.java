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
    //using stack;
    // public ListNode reverseList(ListNode head) {
    //     if(head == null)
    //         return head;
    //     Deque<ListNode> stack = new LinkedList<>();
    //     ListNode current = head;
    //     while(current.next != null){
    //         stack.push(current);
    //         current = current.next;
    //     }
    //     head = current;
    //     while(!stack.isEmpty()){
    //         current.next = stack.pop();
    //         current= current.next;
    //     }
    //     current.next =null;
    //     return head;
    // }
    
    //By reversing the pointers
    public ListNode reverseList(ListNode head) {
         if(head == null)
             return head;
        ListNode prev= null;
        while(head !=null){
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }
}