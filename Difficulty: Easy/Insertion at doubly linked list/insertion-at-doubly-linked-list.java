/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        if(head==null){
            return head;
        }
        
        Node newNode = new Node(x);
        Node curr = head;
        int cnt=0;
        
        while(curr!=null && cnt<p){
            curr=curr.next;
            cnt++;
        }
        
        // invalid condition
        // If current is null, it means 'p' was out of bounds
        
        if(curr==null){
            // The p-th node does not exist. We stop the operation 
            // and return the original head.
            return head;
        }
        
        Node nodeA = curr;
        Node nodeB = curr.next;
        
        if(nodeB!=null){
            newNode.next=nodeB;
            nodeB.prev=newNode;
        }
        
        nodeA.next=newNode;
        newNode.prev=nodeA;
        
        return head;
    }
}