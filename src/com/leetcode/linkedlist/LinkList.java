package com.leetcode.linkedlist;

public class LinkList {

    //head is first node
    private Node head;
    

    public void insertFirst(int val) {
        //create new node object
        Node node = new Node();
        //push value
        node.val = val;
        //assign next as null as it will push in to last node
        node.next = null;
    
        //if head is null that is there is only one node 
        if(head == null) {
            
            head = node;
        }  else {
            //iterate till next val is null and push value at the end of node
            Node n = head;
            while(n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
          
        
    }

    public void display() {
        Node temp = head;
         //System.out.println("values are " + temp.val);
        while(temp != null) {
            System.out.println("values are " + temp.val);
            temp = temp.next;
          
        }

    }


     private class Node{
        private int val;
        private Node next;

        // public Node(int val) {
        //      this.val = val;
        // }

        // public Node(int val, Node next){
        //     this.val = val;
        //     this.next = next;
        // }
         
    }
}
