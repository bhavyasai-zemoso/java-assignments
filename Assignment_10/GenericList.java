package com.assignment.list;

import java.util.Scanner;

public class GenericList {

    public static void main(String args[]){

        SList<Integer> list=new SList<Integer>();

        SListIterator<Integer> sListIterator=list.iterator();

        sListIterator.insert(12);
        sListIterator.insert(13);
        sListIterator.insert(14);
        sListIterator.insert(15);
        sListIterator.insert(16);
        System.out.println(list);
        sListIterator.remove();
        sListIterator.remove();
        sListIterator.remove();
        System.out.println(list);
    }
}

