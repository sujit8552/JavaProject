package CollectionFramework.ListLinkedList;

import java.util.Arrays;
import java.util.LinkedList;

// Actual linked list
class Node{
    public int value;
    public Node next;
}

public class ListLinkedList {

    /*
    * Linked List is second type of List
    * Every element in linked list is known as a Node & Node contains Data and pointer/reference
    *  [1|ref]---->[2|ref]----->[3|ref]---> null (end of linkedlist)
    *   Node1 ----> Node2 -----> Node3
    *  singly , doubly , circular linked list
    * Linked list Node is having data and reference to next Node
    * deletion is easier in linkedlist in middle part, in arraylist elements needs to be shifted
    * LinkedList is better in frequent insertion and deletion in the middle of the list
    * LinkedList has slower random access compared to ArrayList
    * LinkedList requires more memory than ArrayList
    * */

    public static void main(String[] args) {

        // How nodes are there in Original LinkedList
        Node node1 = new Node();
        Node node2 = new Node();
        node1.value = 1;
        node1.next = node2;  //reference to the next node
        node2.value = 2;
        node2.next = null;

        // LinkedList implemented in java collection framework as doubly linkedlist
        LinkedList<Integer> linkedList = new LinkedList<>();
        // add methods
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        linkedList.addLast(12); // O(1)
        linkedList.addFirst(100); // O(1) & in arraylist it will be O(n) due to khiskana padega
        // get method
        System.out.println(linkedList.get(0)); // O(n) due to looping all over the elements, in arraylist it is O(1)
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList);
        // remove methods
        linkedList.remove(0);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(6);
        System.out.println(linkedList);
        linkedList.removeIf(x -> x%2 ==0); // all evens are removed
        System.out.println(linkedList);
        // To create linked list on the fly
        LinkedList<String> animals = new LinkedList<>(Arrays.asList("cat","dog","cow","horse"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("dog","horse"));
        // remove all method
        animals.removeAll(animalsToRemove);
        System.out.println(animals);
    }
}
