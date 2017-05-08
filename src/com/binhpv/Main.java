package com.binhpv;

import com.binhpv.CustomSinglyLinkedList;

// Simple Main class to check whether the list functioning correctly. Use plain old System.out.println so no need for external test library.
public class Main {

    public static void main(String[] args) throws Exception {

        CustomSinglyLinkedList list = new CustomSinglyLinkedList();
        // append random elements, to see that the list can store elements correctly
        list.append(1);
        list.append(2);
        list.append(2);
        list.append(4);
        list.append(3);
        list.append(5);
        list.append(6);

        // This should print 1, 2, 2, 4, 3, 5, 6
        System.out.println(list);

        list.removeElementGreaterThan(3);

        // this should print 1, 2, 2, 3
        System.out.println(list);

        list.removeTail();

        //this should print 1, 2, 2
        System.out.println(list);

    }
}
