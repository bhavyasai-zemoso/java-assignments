package com.practice.concepts;

public class Palindrome{
	public static void main(String a[]) {
		Node a1 = new Node(1); 
        Node a2 = new Node(2); 
        Node a3 = new Node(3); 
        Node a4= new Node(2); 
        Node  a5= new Node(1); 
        a1.next = a2; 
        a2.next = a3; 
        a3.next = a4; 
        a4.next = a5;
        System.out.println("isPalidrome :" + isPalindrome(a1)); 
	}
	
	public static boolean isPalindrome(Node head) {    
        
        int n = 0;
        Node current = head;
        while(current != null) {
            current = current.next;
            n++;
        }
        
        int mid = n / 2;
        Node prev = null;
        Node curr = head;
        int i = 0;
        
        while(i < mid) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            i++;
        }
        
        if(n % 2 != 0) {
            curr = curr.next;
        }
        
        while(prev != null && curr != null) {
            if(prev.val != curr.val) {
                return false;
            }
            prev = prev.next;
            curr = curr.next;
        }
        
        return true;
    }
}
   
