package CollectionFramework.ListVector;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        /*
        * Vector is a part of List
        * Vector is dynamic array
        *
        * */

        Vector<Integer> vector = new Vector<>();
        // .capacity method in vector
        System.out.println(vector.capacity()); // initial capacity is 10
        // create a vector of initial capacity 5 and then add 5 elements and print capacity after that
        // add 6th  element and check the capacity
        Vector<Integer> v1 = new Vector<Integer>(5);
        // add method in vector
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.add(5);
        System.out.println(v1.capacity()); // 5
        v1.add(6);
        System.out.println(v1.capacity()); // should be 10 because in vector it gets doubled
        // but you can increment capacity as per your need also, e.g.initial capacity 5 and increment by 3
        Vector<Integer> v2 = new Vector<>(5,3);
        System.out.println("capacity before : " + v2.capacity()); // capacity 5
        v2.add(1);
        v2.add(2);
        v2.add(3);
        v2.add(4);
        v2.add(5);
        v2.add(6);
        System.out.println("capacity after: " + v2.capacity()); // capacity 8
        // another constructor takes collection
        Vector<String> v3 = new Vector<>(Arrays.asList("cat","dog","horse","goat"));
        System.out.println("capacity: "+v3.capacity() + " size: " + v3.size());
        // We can pass List, ArrayList , LinkedList as well as a collection
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        Vector<Integer> v5 = new Vector<>(linkedList);
        System.out.println(v5);

        // *********** Methods in vector *******************
        Vector<Integer> vec = new Vector<>();
        // add method
        vec.add(1);
        // add(index,element) : add element at specified index
        vec.add(1,15);
        System.out.println(vec);
        // get method
        System.out.println(vec.get(1));
        // set(index,element) : replaces the element at specified index
        vec.set(1,4);
        System.out.println(vec);
        // print elements using loop
        Vector<Integer> vec2 = new Vector<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        for (int i=0; i<vec2.size(); i++){
            System.out.print(vec2.get(i)+" ");
        }
        System.out.println();
        // isEmpty() method : To check if the vector is empty
        System.out.println(vec2.isEmpty());
        // contains(Object o) : checks if the vector contains the specified element
        System.out.println(vec2.contains(5));
        // clear method : clears all
        vec2.clear();
        System.out.println(vec2);

        // Internally veector is implemented by array only, which grows as needed when more elements are
        // added, default behaviour is to double the size of the array when it runs out of space

        /*
        *  ****** Synchronization and performance *******
        * Synchronization means if 2 thread comes to add things into same vector then one thing at a one
        * time will happen so there will be consistency, only one thread can access at one time so this
        * makes it thread safe, but introduces performance overhead in single threaded environment because
        * synchronization adds locking and unlocking costs.
        *
        * In modern java ArrayList is generally preffered over vector when Synchronization is not required.
        *
        *
        * */
    }
}
