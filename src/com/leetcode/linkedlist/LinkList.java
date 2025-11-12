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

    public void insertAtStart(int val){
        Node node = new Node();
        node.val = val;
        node.next = null;

        node.next = head;

        head = node;
    }

    public void insertAt(int val, int index) {


        // add the value to node
        Node node = new Node();
        node.val = val;
        node.next = null;

        //for index 0 push at first position
        if(index ==0) {
            insertAtStart(val);
        } else{
                    //traverse through LL until index is reached

            Node n = head;
        for(int i= 0; i < index-1; i++) {
            n = n.next;
        }

        //once position is reached assign node val 
        node.next = n.next;
        n.next = node;

        }
        
    }

    public void deleteAt(int index) {

        if(index== 0) {
            head = head.next;
        } else {
            Node n = head;

            //assume n1 as index element which needs to be removed since we don't know val of next let's assign it as null
            Node n1 = null;
            
            //iterate till index 
             for(int i= 0; i < index-1; i++) {
                n = n.next;
            }
            //once we reached position fetch addrs of index position
            //assign the address to n1
            
            n1 = n.next;

            //assign n1 addrr to n.next since we have to remove the element 
            n.next = n1.next;

            //assign val as null for garbage collection even though we delinked linkl;ist the value will still be present, so assign it as null so it will be eligible for GC
            n1=null;

        }
    }

    
   public void reverseList() {

    Node prev = null;
    Node curr = head;

    while (curr != null) {
        Node next = curr.next; // save next node
        curr.next = prev;      // reverse pointer
        prev = curr;           // move prev forward
        curr = next;   
                // move curr forward
    }
    
    head = prev; 
    ///return prev; // prev becomes new head
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
