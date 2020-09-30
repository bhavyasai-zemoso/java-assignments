package com.assignment.list;

/**
 * This is single node class definition used in the list.
 * Each node contains its data and link to the next node in the list.
 * @param <T>
 */
public class Node<T> {
	 T data;
    Node<T> next;

    public Node(T t)
    {
        this.data = t;
        this.next = null;
    }
}
