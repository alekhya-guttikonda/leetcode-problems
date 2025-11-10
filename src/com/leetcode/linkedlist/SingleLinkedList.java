package com.leetcode.linkedlist;

import java.util.Arrays;

public class SingleLinkedList {


     public static void main(String[] args) {
      insertElements();
    }
    
    public static void insertElements() {
        LinkList list = new LinkList();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertAtStart(5);
        list.insertAt(4,1 );
        list.display();

    }

}
