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
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        int size=0;
        ListNode s=head;
        while(s!=null)
        {
            size++;
            s=s.next;
        }
      ListNode prev=null;
      ListNode next1=null;
      int count =0;
      ListNode curr=head;
      while(count<k&&curr!=null)
      {
        next1=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next1;
        count++;
          size--;
      }
      if(next1!=null && k <= size)
      {
        head.next=reverseKGroup(next1,k);
      }
        else{
            head.next=next1;
        }
      return prev;
    }
}