package CodeWithHery.com.io;
public class CWH_092_01_LinkedList_in_Java_Demo_Methods {
}
//       The LinkedList class in Java provides us with the doubly linked list data structure.
//       Each element of the linked list is known as a node.
//       Each node points to the address of the next node & its previous node.
//       Linked lists are preferred over the Array list because the insertion & deletion in the linked lists can be done in a constant time. But, in arrays, if we want to add or delete an element in between then, we need to shift all the other elements.
/*
1=>  Performing various operations on LinkedList :
    =>   Adding Element in LinkedList:
        Similar to ArrayList, add() method is used to add elements in a linked list.
        add(Object): Inserts an element at the end of the ArrayList.
        add(Index,Object) : Inserts an element at the given index.
        Example :
        import java.util.*;
public class CWH extends Thread{
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(11);
        l1.add(22);
        l1.add(33);
        l1.add(44);
        l1.add(55);
        l1.add(77);
        l1.add(5,77); // Inserts 77 at index 5
        System.out.println("L1 Linked list : "+ l1);

    }
}

Output :L1 Linked list : [11, 22, 33, 44, 55, 77, 77]


2=> Removing an element from the LinkedList:
remove() method is used to remove an element from the linked list.
Example :
import java.util.*;
public class CWH extends Thread{
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(11);
        l1.add(22);
        l1.add(33);
        l1.add(44);
        l1.add(55);
        l1.add(77);
        l1.add(5,77);
        System.out.println("L1 Linked list before: "+ l1);

        l1.remove(2); //removes element present at 2nd index
        System.out.println("L1 Linked list after: "  + l1);

    }
}

Output :    L1 Linked list before: [11, 22, 33, 44, 55, 77, 77]
            L1 Linked list after: [11, 22, 44, 55, 77, 77]


3=> Changing An Element Of Linked List :
set() method is used to change an already existing element of a linked list.

Example :
import java.util.*;
public class CWH extends Thread{
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(11);
        l1.add(22);
        l1.add(33);
        l1.add(44);
        l1.add(55);
        l1.add(66);
        System.out.println("L1 Linked list before: "+ l1);

        l1.set(2,10); //changes element present at 2nd index (33 changed to 10)
        System.out.println("L1 Linked list after: "  + l1);

    }
}
Output  :   L1 Linked list before: [11, 22, 33, 44, 55, 66]
            L1 Linked list after: [11, 22, 10, 44, 55, 66]

4=> nserting an element at the last of the linked list:
addlast() method is used to insert an element at the start of the linked list.

Example :
F.	import java.util.*;
public class CWH extends Thread{
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(11);
        l1.add(22);
        l1.add(33);
        l1.add(44);
        l1.add(55);
        l1.add(66);
        System.out.println("L1 Linked list before: "+ l1);

        l1.addLast(100); //Inserting 100 at the end of L1
        System.out.println("L1 Linked list after inserting element at last index: "  + l1);

    }
}
Output :    L1 Linked list before: [11, 22, 33, 44, 55, 66]
            L1 Linked list after inserting element at last index: [11, 22, 33, 44, 55, 66, 100]

5 =>Inserting an element at the start of the linked list:
addFirst() method is used to insert an element at the start of the linked list.

Example :
import java.util.*;
public class CWH extends Thread{
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(11);
        l1.add(22);
        l1.add(33);
        l1.add(44);
        l1.add(55);
        l1.add(66);
        System.out.println("L1 Linked list before: "+ l1);

        l1.addFirst(0); //Inserting 0 at the starting of L1
        System.out.println("L1 Linked list after: "  + l1);

    }
}
Output :    L1 Linked list before: [11, 22, 33, 44, 55, 66]
            L1 Linked list after: [0, 11, 22, 33, 44, 55, 66]

package com.company;

import java.util.*;

public class cwh_92_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0, 5);
        l1.add(0, 1);
        l1.addAll(0, l2);
        l1.addLast(676);
        l1.addFirst(788);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        //l1.clear();
        l1.set(1, 566);
        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}



 */