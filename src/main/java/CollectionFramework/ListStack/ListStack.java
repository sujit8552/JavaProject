package CollectionFramework.ListStack;

import java.util.Stack;

public class ListStack {
    public static void main(String[] args) {
        /*
        * Stack extends vector and is part of List
        *        Stack example: Books stacked up like below, stack of books, ek ke upar ek
        *       |-----------| 1
        *       |-----------| 2
        *       |-----------| 3
        *       |-----------| 4
        *
        * 1) Stack follows LIFO principle (Last In First Out)
        * 2) Latest item will be removed in stack due to LIFO
        * 3) Stack extends Vector but with LIFO constraint
        * */

        Stack<Integer> stack = new Stack<>();
        // Push method to add element into stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        // pop method to remove elements
        System.out.println("Removed element: "+ stack.pop());
        System.out.println(stack);
        // peek method to check top element
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        // search method will give you index from top but search is 1 based indexing
        System.out.println("search: "+stack.search(3));


        // As stack class extends vector so we can use add method as well and we are not limited to
        // only stack behaviour
        Stack<Integer> s1 = new Stack<>();
        s1.add(1);
        s1.add(2);
        System.out.println(s1.get(0));
        System.out.println(s1.get(1));

        // We can use LinkedList as stack also using addLast method but it is not recommended and good


    }
}
