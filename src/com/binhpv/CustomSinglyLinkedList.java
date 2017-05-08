package com.binhpv;

/**
 * Created by binhpv on 5/8/17.
 */
public class CustomSinglyLinkedList {
    private Node head;

    /**
     * Append an int to the end of the list
     *
     * @param value value to insert
     */
    public void append(int value) {
        Node newNode = new Node();
        newNode.data = value;
        if (head == null) {
            head = newNode;
        } else {
            Node tmp = head;
            while (tmp.nextNode != null) {
                tmp = tmp.nextNode;
            }

            tmp.nextNode = newNode;
        }
    }

    /**
     * Remove the tail element from the list
     * @throws Exception if the list is empty
     */
    public void removeTail() throws Exception {
        if (head == null) {
            throw new Exception("Cannot remove from an empty list.");
        }
        if (head.nextNode == null) {
            head = null;
        } else {
            Node tmp1 = head, tmp2 = tmp1;
            while (tmp1.nextNode != null) {
                tmp2 = tmp1;
                tmp1 = tmp1.nextNode;
            }
            tmp2.nextNode = null;
        }
    }

    /**
     * remove all elements that are greater than input value
     *
     * @param value elements greater than this value will be removed
     */
    public void removeElementGreaterThan(int value) {
        if (head == null) {
            return;
        }
        Node tmp1 = head, tmp2 = tmp1;

        while (tmp1.nextNode != null) {
            // if the head is to be removed, then move head to the next element, also set temp var to the new head
            if (head.data > value) {
                head = head.nextNode;
                tmp1 = tmp2 = head;
                continue;
            }

            if (tmp1.data > value) {
                tmp1 = tmp1.nextNode;
                tmp2.nextNode = tmp1;
            } else {
                tmp2 = tmp1;
                tmp1 = tmp1.nextNode;
            }

        }
        if (tmp2.nextNode.data > value) {
            tmp2.nextNode = null;
        }
    }

    @Override
    public String toString() {
        if (head == null) {
            return "The list is empty";
        } else {
            StringBuilder builder = new StringBuilder();
            Node tmp = head;
            while (tmp.nextNode != null) {
                builder.append(tmp.data).append(", ");
                tmp = tmp.nextNode;
            }
            builder.append(tmp.data);
            return builder.toString();
        }
    }

    private class Node {
        int data;
        Node nextNode;

    }
}
