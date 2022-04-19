// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
}

class Partition {
    static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail = tail.next;
            }

            int k = sc.nextInt();
            Solution ob = new Solution();
            Node res = ob.partition(head, k);
            printList(res);
            System.out.println();
        }
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}// } Driver Code Ends


// User function Template for Java

/*class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/
class Solution {
    public static Node partition(Node head, int x) {
        if(head==null) return null;
        Node smallerList=null,
             equalList=null,
             greaterList=null,
             smaller=smallerList,
             equal=equalList,
             greater=greaterList,
             curr=head;
             while(curr!=null){
                 int data=curr.data;
                 if(data==x){
                     if(equal==null){
                         equalList=new Node(data);
                         equal=equalList;
                     }
                     else{
                         equal.next=new Node(data);
                         equal=equal.next;
                     }
                 }
                 else if(data<x){
                     if(smaller==null){
                         smallerList=new Node(data);
                         smaller=smallerList;
                     }
                     else{
                         smaller.next=new Node(data);
                         smaller=smaller.next;
                     }
                 }
                 else{
                     if(greater==null){
                         greaterList=new Node(data);
                         greater=greaterList;
                     }
                     else{
                         greater.next=new Node(data);
                         greater=greater.next;
                     }
                 }
                 curr=curr.next;
             }
             if(smallerList==null&&equalList==null) return greaterList;
             if(equalList==null&&greaterList==null) return smallerList;
             if(smallerList==null&&greaterList==null) return equalList;
             if(equalList==null){
                 smaller.next=greaterList;
                 return smallerList;
             }
             if(smallerList==null){
                 equal.next=greaterList;
                 return equalList;
             }
             if(greaterList==null){
                 smaller.next=equalList;
                 return smallerList;
             }
             smaller.next=equalList;
             equal.next=greaterList;
             head= smallerList;
             return head;
    }
}