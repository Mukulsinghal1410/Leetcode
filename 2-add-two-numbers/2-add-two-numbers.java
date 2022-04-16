class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode start = new ListNode(); //creating the dummy node to store the answer.
        ListNode temp = start; // temp node which will move.
        int carry = 0;
        while( l1 != null || l2 != null || carry != 0){
            int sum = 0;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode node = new ListNode(sum); // creating the node for each digit.
            temp.next = node; // creating the answer linked list.
            temp = temp.next;
            
        }
        return start.next;
    }
}