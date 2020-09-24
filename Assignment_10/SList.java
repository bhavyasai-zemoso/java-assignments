package com.assignment.list;

/**
 * This is the main list class from which we can access list through list iterator.
 * @param <T>
 */
public class SList<T>  {

     Node<T> head=new Node<>(null);
     SListIterator<T> iterator;

    SList(){
        iterator = new SListIterator<T>(head);
    }
    
    public SListIterator<T> iterator()
    {
        return iterator;
    }
    
    public String toString() {


        SListIterator<T> it = this.iterator();
     

        StringBuilder s = new StringBuilder();

        while(it.hasNext()) {

            s.append(it.next() + (it.hasNext() ? ", " : ""));
        }
        it.setCurrentNode();
        return "SList: " + s.toString();
    }

}



