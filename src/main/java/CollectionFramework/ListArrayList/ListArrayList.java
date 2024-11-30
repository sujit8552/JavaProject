package CollectionFramework.ListArrayList;

import java.util.*;

class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        // custom logic
        return o1.length() - o2.length();
    }
}
// o1    o2
// "ok"  "bye"

class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        //return o1 - o2; // ascending order (return "+" means ascending)
        return o2 - o1; // descending order (return "-" means descending)
    }
}

public class ListArrayList {
    public static void main(String[] args) {

        // ArrayList = to store duplicate data

        ArrayList<Integer> list = new ArrayList<Integer>();
        // .add() to add data
        list.add(1); // 0
        list.add(23); //1
        list.add(54); //2
        // .get() to get data
        System.out.println(list.get(0));
        // .size() to get size
        System.out.println(list.size());
        // for loop
        System.out.println("For loop");
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        // for each loop
        System.out.println("For each loop");
        for (int ele: list){
            System.out.println(ele);
        }
        // .contains() method to check existence returns bool
        System.out.println(list.contains(23));
        System.out.println(list.contains(55));
        // .remove(index) method to remove element from index place
        list.remove(2);
        for (int i : list){
            System.out.println(i);
        }
        // if we want to insert element between 2 elements fore.g. at index 2 // khisak jata hain
        list.add(2,50);
        for (int i : list){
            System.out.println(i);
        }
        // .set(index, element) method if we just want to replace element
        list.set(1,30);
        for (int i : list){
            System.out.println(i);
        }
        /*
        * By default the capacity of the array list is set to 10, we can also set the capacity
        * by ourselves so that to avoid the overhead for.e.g to 1000.
        * list cannot be shrink automatically but we can do it by .trimToSize() method
        *
        * */

        /*Interview question : Can we set capacity to list?
        Ans => Yes we can set initial capacity to list
        Q) if we set capacity to 1000 and do list.size() what will be the output?
        Ans => size will not print the capacity it will print no. of elements available in that
        list, if no elements then size will be 0.
        * IMP:Once the list get full upto its capacity it will increase its capacity by 1.5x times.
        For e.g.
        setting initial capacity for 1000 elements
        * */
        ArrayList<Integer> list1 = new ArrayList<>(1000);
        System.out.println(list1.size()); // output = 0
        list1.add(1);
        list1.add(5);
        System.out.println(list1.size());

        // Creating list with default constructor set capacity to 10
        ArrayList<String> list3 = new ArrayList<>();

        // Creating list on the go with Arrays
        List<String> list4 = Arrays.asList("Sunday", "Monday", "Tuesday");
//        list4.add("Wednesday"); // This wont happen
//        list4.remove(2); // This wont happen
        list4.set(2,"Wednesday"); // we can replace

        String[] array = {"Apple","Mango","Banana"};
        List<String> list5 = Arrays.asList(array);

        /*
        * .asList() returns a fixed size array list, so the reason we cannot add or remove element
        * from list created with .asList() method
        * But if we want to make change then we can do by creating new list out of existing list
        * */
        List<String> listNew = new ArrayList<>(list5);
        listNew.add("Guava");
        System.out.println(listNew);

        // we can also create List with List.of() method
        List<Integer> list6 = List.of(1,2,3,4);
//        list6.set(1,33); this is not possible due to immutable object

        // addAll method to add list to another list entirely
        List<Integer> listOfInt = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> listFirst = new ArrayList<>();
        listFirst.add(1);
        listFirst.add(10);
        // Now we will add listOfInt full into listFirst
        listFirst.addAll(listOfInt);
        System.out.println(listFirst);

        // remove by object
        List<Integer> listNum = new ArrayList<>();
        listNum.add(1);
        listNum.add(2);
        listNum.add(3);

        listNum.remove(Integer.valueOf(1));
        System.out.println(listNum);

        // Coverting list to Array
        List<Integer> list10 = new ArrayList<>();
        list10.add(1);
        listNum.add(2);
        listNum.add(3);
        Integer[] array1 = listNum.toArray(new Integer[0]);

        // Sorting an ArrayList
        List<Integer> listt = new ArrayList<>();
        listt.add(5);
        listt.add(1);
        listt.add(7);
        listt.add(2);
        listt.add(10);
        listt.add(0);
        listt.sort(null); // pass null for comparator
        //Collections.sort(listt);
        System.out.println(listt);

        /*
        * Time Complexity
        * Access by index (get) is O(1)
        * Adding an element in O(n) in the worst case
        * Removing elements can be O(n) because it may involve shifting elements
        * Iteration is O(n)
        * */

        // ########### Comparator ###############

        // Custom comparator for Interger List
        List<Integer> numbers = Arrays.asList(5,2,8,1,9,3,6);
        numbers.sort(new MyComparator());
        System.out.println("numbers: " + numbers);

        // natural sorting : pass null
        List<String> words = Arrays.asList("Mango", "Banana", "Apple", "date");
        words.sort(null);
        System.out.println(words);
        // but now suppose I want to sort based on length of words
        // For this we will implement new class StringLengthComparator
        words.sort(new StringLengthComparator());
        System.out.println(words);

        // ######## Comparator using Lambda Expression ########3
        // Now without creating classes also we can add comparator using lambda expression
        words.sort((a,b) -> a.length() - b.length()); // ascending
        System.out.println(words);
        words.sort((a,b) -> b.length() - a.length()); // descending
        System.out.println(words);

        // Lambda comparator sorting in Integer array
        List<Integer> nums = Arrays.asList(4,2,6,1,8,3,0,7);
        nums.sort((a,b) -> a - b ); //ascending order
        System.out.println(nums);
        nums.sort((a,b) -> b -a );
        System.out.println(nums);

        // 52:07

    }
}
